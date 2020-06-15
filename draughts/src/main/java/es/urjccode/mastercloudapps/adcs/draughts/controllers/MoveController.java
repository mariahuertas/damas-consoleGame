package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;

public class MoveController extends Controller {
    private static final int MINIMUM_COORDINATES = 2;

    public MoveController(Session session) {
        super(session);
    }

    public Error move(Coordinate... coordinates) {
        assert coordinates.length >= MoveController.MINIMUM_COORDINATES;
        for(Coordinate coordinate: coordinates)
            assert coordinate != null;
        Error error = this.game.move(coordinates);
        if (this.game.isBlocked())
            this.state.next();
        return error;
    }
}
