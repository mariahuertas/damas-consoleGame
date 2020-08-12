package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.Logic;
import es.urjccode.mastercloudapps.adcs.draughts.models.DAO.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class LogicImplementation extends Logic {

	public LogicImplementation() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        this.session = new SessionImplementation();
        SessionImplementationDAO sessionImplementationDAO = new SessionImplementationDAO((SessionImplementation) this.session);

        Reflections reflections = new Reflections("es.urjccode.mastercloudapps.adcs");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(ControllerImplementation.class);

        for(Class<?> controllerImplementation: annotated) {
            ControllerImplementation annotation = controllerImplementation.getAnnotation(ControllerImplementation.class);

            if (annotation.value() == StateValue.SAVING || annotation.value() == StateValue.INITIAL) {
                Constructor constructor = controllerImplementation.getConstructor(Session.class, SessionImplementationDAO.class);
                AceptorController aceptorController = (AceptorController) constructor.newInstance(this.session, sessionImplementationDAO);
                this.acceptorControllers.put(annotation.value(), aceptorController);
            } else {
                Constructor constructor = controllerImplementation.getConstructor(Session.class);
                AceptorController aceptorController = (AceptorController) constructor.newInstance(this.session);
                this.acceptorControllers.put(annotation.value(), aceptorController);
            }
        }
        this.acceptorControllers.put(StateValue.EXIT, null);

	}

}
