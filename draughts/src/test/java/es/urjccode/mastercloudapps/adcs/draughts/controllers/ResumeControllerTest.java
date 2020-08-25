package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.junit.Assert.assertEquals;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.State;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation.ResumeControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import org.junit.Before;
import org.junit.Test;

public class ResumeControllerTest {

    private State state;
    private ResumeController resumeController;

    @Before
    public void before(){
        GameImplementation game = new GameBuilder().build();
        this.state = new State();
        Session session = new SessionImplementation(game, state);
        this.resumeController = new ResumeControllerImplementation(session, null);
    }

    @Test
    public void givenResumeControllerWhenResumeGameMoveToInitialStateRequiereCorrectThenNotError() {
        assertEquals(StateValue.INITIAL, this.state.getValueState());
        resumeController.isNewGame(false);
        assertEquals(StateValue.IN_GAME, this.state.getValueState());
        resumeController.isNewGame(false);
        assertEquals(StateValue.FINAL, this.state.getValueState());
        resumeController.isNewGame(true);
        assertEquals(StateValue.INITIAL, this.state.getValueState());
    }

    @Test(expected = AssertionError.class)
    public void givenResumeControllerWhenResumeGameMoveOutThenError() {
        assertEquals(StateValue.INITIAL, this.state.getValueState());
        resumeController.isNewGame(false);
        assertEquals(StateValue.IN_GAME, this.state.getValueState());
        resumeController.isNewGame(false);
        assertEquals(StateValue.FINAL, this.state.getValueState());
        resumeController.isNewGame(false);
        assertEquals(StateValue.EXIT, this.state.getValueState());
        resumeController.isNewGame(false);
    }
}
