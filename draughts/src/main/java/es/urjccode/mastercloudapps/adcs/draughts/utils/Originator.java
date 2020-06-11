package es.urjccode.mastercloudapps.adcs.draughts.utils;

public interface Originator {

    void restore(Memento memento);

    Memento createMemento();

}
