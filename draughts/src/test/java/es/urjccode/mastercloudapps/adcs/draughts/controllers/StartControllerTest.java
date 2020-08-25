package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.junit.Assert.assertEquals;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.State;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation.StartControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {

    private State state;
    private StartController startController;

    @Before
    public void before(){
        GameImplementation game = new GameBuilder().build();
        this.state = new State();
        Session session = new SessionImplementation(game, state);
        this.startController = new StartControllerImplementation(session, null);
    }

     @Test
    public void givenStartControllerWhenStartGameThenChangeState() {
        assertEquals(StateValue.INITIAL, state.getValueState());
        startController.start();
        assertEquals(StateValue.IN_GAME, state.getValueState());
    }

}
