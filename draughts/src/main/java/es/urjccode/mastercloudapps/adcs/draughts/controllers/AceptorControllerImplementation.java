package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class AceptorControllerImplementation extends AceptorController {
    public AceptorControllerImplementation(Session session) {
        super(session);
    }

    public Piece getPiece(Coordinate coordinate) {
        return ((SessionImplementation)this.session).getPiece(coordinate);
    }

    public Color getColor(Coordinate coordinate) {
        assert coordinate != null;
        return ((SessionImplementation)this.session).getColor(coordinate);
    }

    public int getDimension() {
        return ((SessionImplementation)this.session).getDimension();
    }
}
