package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.*;

public abstract class Controller {

    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public Color getColor(Coordinate coordinate) {
        assert coordinate != null;
        return this.session.getColor(coordinate);
    }

    public int getDimension() {
        return this.session.getDimension();
    }

}
