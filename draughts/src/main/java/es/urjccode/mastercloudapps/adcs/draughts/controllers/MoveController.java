package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;

public class MoveController extends Controller {
    private static final int MINIMUM_COORDINATES = 2;

    public MoveController(SessionImplementation session) {
        super(session);
    }



    public Error move(Coordinate... coordinates) {
        assert coordinates.length >= MoveController.MINIMUM_COORDINATES;
        for(Coordinate coordinate: coordinates)
            assert coordinate != null;
            Error error = ((SessionImplementation) this.session).move(coordinates);
            if (this.session.isBlocked())
                ((SessionImplementation) this.session).next();

        return error;
    }
}
