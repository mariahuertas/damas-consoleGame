package es.urjccode.mastercloudapps.adcs.draughts;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Application;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.BoardGame;
import es.urjccode.mastercloudapps.adcs.draughts.models.GameImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.LogicImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

@Application
public class Draughts extends BoardGame {

    public Draughts() {
        super();
        this.logic = new LogicImplementation(new SessionImplementation(new GameImplementation()));
    }

}
