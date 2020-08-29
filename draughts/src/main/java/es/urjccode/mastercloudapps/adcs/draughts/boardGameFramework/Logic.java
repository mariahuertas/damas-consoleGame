package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;
import org.reflections.Reflections;

public class Logic {

    protected Session session;

    protected Map<StateValue, AceptorController> acceptorControllers;

    public Logic(Session session) {
        this.session = session;
        this.acceptorControllers = new HashMap<StateValue, AceptorController>();
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

	public AceptorController getController() {
        return this.acceptorControllers.get(this.session.getValueState());
    }

}
