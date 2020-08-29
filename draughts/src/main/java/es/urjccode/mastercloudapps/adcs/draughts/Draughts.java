package es.urjccode.mastercloudapps.adcs.draughts;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.BoardGame;
import es.urjccode.mastercloudapps.adcs.draughts.models.GameImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.LogicImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

//@Application
public class Draughts extends BoardGame {

    public Draughts() {
        super();
        this.logic = new LogicImplementation(new SessionImplementation(new GameImplementation()));
        // template method to avoid new Logic() here
    }

    public static void main(String[] args)  {
        new Draughts().play();
    }




}
