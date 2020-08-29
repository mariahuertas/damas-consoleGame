package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

public interface Originator {

    void restore(GameMemento memento) throws Exception;

    GameMemento createMemento() throws Exception;

}
