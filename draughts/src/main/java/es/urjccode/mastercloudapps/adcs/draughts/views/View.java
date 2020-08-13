package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.DAO.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Set;

public class View implements ControllerVisitor {

    private HashMap<StateValue, SubView> annotatedViewsMap;

    public View() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        this.annotatedViewsMap = new HashMap<StateValue, SubView>();

        Reflections reflections = new Reflections("es.urjccode.mastercloudapps.adcs");
        Set<Class<?>> annotatedViews = reflections.getTypesAnnotatedWith(SubViewImplementation.class);
        Set<Class<?>> annotatedControllers = reflections.getTypesAnnotatedWith(ControllerImplementation.class);

        for(Class<?> subViewClass: annotatedViews) {
            SubViewImplementation annotation = subViewClass.getAnnotation(SubViewImplementation.class);
            Constructor constructor = subViewClass.getConstructor();
            SubView subViewInstance = (SubView) constructor.newInstance();
            annotatedViewsMap.put(annotation.value(), subViewInstance);
        }

    }

    public void interact(AceptorController controller) {
        assert controller != null;
        controller.accept(this);
    }

    @Override
    public void visit(AceptorController aceptorController)  {
        Class<?> controllerClass = aceptorController.getClass();
        ControllerImplementation annotation = controllerClass.getAnnotation(ControllerImplementation.class);
        SubView matchingView = this.annotatedViewsMap.get(annotation.value());
        matchingView.interact(aceptorController);
    }
}
