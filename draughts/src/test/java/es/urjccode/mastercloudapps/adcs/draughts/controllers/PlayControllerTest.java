package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.State;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation.PlayControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import org.junit.Test;

public class PlayControllerTest {

    private PlayControllerImplementation playController;

    @Test
    public void testGivenPlayControllerWhenMoveThenOk() {
        GameImplementation game = new GameBuilder().build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session, null);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(4, 1);
        playController.move(origin, target);
        assertFalse(game.isBlocked());
    }

    @Test
    public void testGivenPlayControllerWhenMoveWithoutPiecesThenIsBlocked() {
        GameImplementation game = new GameBuilder().rows(
            "        ",
            "        ",
            "        ",
            "        ",
            " n      ",
            "b       ",
            "        ",
            "        ").build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session, null);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(3, 2);
        playController.move(origin, target);
        assertTrue(game.isBlocked());
    }

    @Test
    public void testGivenPlayControllerWhenMoveWithoutMovementsThenIsBlocked() {
        GameImplementation game = new GameBuilder().rows(
            "        ",
            "        ",
            "   n    ",
            "  b b   ",
            "     b  ",
            "b       ",
            "        ",
            "        ").build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session, null);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(4, 1);
        playController.move(origin, target);
        assertTrue(game.isBlocked());
    }

    @Test
    public void testGivenPlayControllerWhenCancelThenOk() {
        GameImplementation game = new GameBuilder().build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session, null);
        playController.cancel();
        assertFalse(game.isBlocked());
    }

}
