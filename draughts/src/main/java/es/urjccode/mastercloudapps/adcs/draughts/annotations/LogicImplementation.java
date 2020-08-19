package es.urjccode.mastercloudapps.adcs.draughts.annotations;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.Logic;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.Set;

public class LogicImplementation extends Logic {

	public LogicImplementation(){

        this.session = new SessionImplementation();
        SessionImplementationDAO sessionImplementationDAO = new SessionImplementationDAO((SessionImplementation) this.session);
        Reflections reflections = new Reflections("es.urjccode.mastercloudapps.adcs");

        try {
            Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(ControllerImplementation.class);

            for(Class<?> controllerImplementation: annotated) {
                ControllerImplementation annotation = controllerImplementation.getAnnotation(ControllerImplementation.class);
                Constructor constructor = controllerImplementation.getConstructor(Session.class, SessionImplementationDAO.class);
                AceptorController aceptorController = (AceptorController) constructor.newInstance(this.session, sessionImplementationDAO);
                this.acceptorControllers.put(annotation.value(), aceptorController);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.acceptorControllers.put(StateValue.EXIT, null);
	}

}
