package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.memento.GameMemento;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.memento.MementoAttribute;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.memento.MementoField;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.memento.Originator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import static java.util.Objects.requireNonNull;


public abstract class Game implements Originator {

    public boolean isBlocked(){
        return true;
    }


    abstract public void reset();
    abstract public void cancel();

    @Override
    public GameMemento createMemento() throws Exception {

        GameMemento gameMemento = new GameMemento();
        HashMap<String, Object> mementoFields = new HashMap<String, Object>();
        Class<?> objectClass = requireNonNull(this).getClass();

        for (Field field : objectClass.getDeclaredFields()) {

            field.setAccessible(true);

            if (field.isAnnotationPresent(MementoField.class)) {

                String annotationValue = field.getAnnotation(MementoField.class).value();
                Class<?> fieldClass = field.get(this).getClass();

                Constructor constructor = fieldClass.getConstructor();
                MementoAttribute mementoAttribute = (MementoAttribute) constructor.newInstance();
                mementoAttribute.initializeMemento((MementoAttribute) field.get(this));
                mementoFields.put(annotationValue, mementoAttribute);
            }
        }

        gameMemento.setMemento(mementoFields);
        return gameMemento;
    }

    @Override
    public void restore(GameMemento gameMemento) throws Exception {

        HashMap<String, Object> mementoFields = gameMemento.getMemento();
        Class<?> objectClass = requireNonNull(this).getClass();

        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(MementoField.class)) {
                String annotationValue = field.getAnnotation(MementoField.class).value();
                Object mementoField = mementoFields.get(annotationValue);
                field.set(this, mementoField);
            }
        }
    }
}
