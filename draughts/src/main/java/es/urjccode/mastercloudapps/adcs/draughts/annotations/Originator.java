package es.urjccode.mastercloudapps.adcs.draughts.annotations;

public interface Originator {

    void restore(Memento memento) throws Exception;

    Memento createMemento() throws Exception;

}
