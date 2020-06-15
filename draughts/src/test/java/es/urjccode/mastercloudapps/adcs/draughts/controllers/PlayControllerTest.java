package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation.PlayControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import org.junit.Test;

public class PlayControllerTest {

    private PlayController playController;

    @Test
    public void testGivenPlayControllerWhenMoveThenOk() {
        Game game = new GameBuilder().build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(4, 1);
        playController.move(origin, target);
        assertEquals(playController.getColor(target), Color.WHITE);
        assertFalse(game.isBlocked());
    }

    @Test
    public void testGivenPlayControllerWhenMoveWithoutPiecesThenIsBlocked() {
        Game game = new GameBuilder().rows(
            "        ",
            "        ",
            "        ",
            "        ",
            " n      ",
            "b       ",
            "        ",
            "        ").build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(3, 2);
        playController.move(origin, target);
        assertEquals(playController.getColor(target), Color.WHITE);
        assertTrue(game.isBlocked());
    }

    @Test
    public void testGivenPlayControllerWhenMoveWithoutMovementsThenIsBlocked() {
        Game game = new GameBuilder().rows(
            "        ",
            "        ",
            "   n    ",
            "  b b   ",
            "     b  ",
            "b       ",
            "        ",
            "        ").build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session);
        Coordinate origin = new Coordinate(5, 0);
        Coordinate target = new Coordinate(4, 1);
        playController.move(origin, target);
        assertEquals(playController.getColor(target), Color.WHITE);
        assertTrue(game.isBlocked());
    }

    @Test
    public void testGivenPlayControllerWhenCancelThenOk() {
        Game game = new GameBuilder().build();
        Session session = new SessionImplementation(game, new State());
        playController = new PlayControllerImplementation(session);
        playController.cancel();
        assertEquals(Color.BLACK, playController.getColor());
        assertFalse(game.isBlocked());
    }

}
