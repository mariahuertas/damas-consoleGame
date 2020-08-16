package es.urjccode.mastercloudapps.adcs.draughts.utils;

public interface Originator {

    void restore(Memento memento) throws IllegalAccessException, Exception;

    Memento createMemento() throws IllegalAccessException, Exception;

}
