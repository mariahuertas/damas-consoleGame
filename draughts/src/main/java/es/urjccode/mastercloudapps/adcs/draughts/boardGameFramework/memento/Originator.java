package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.memento;

public interface Originator {

    void restore(GameMemento memento) throws Exception;

    GameMemento createMemento() throws Exception;

}
