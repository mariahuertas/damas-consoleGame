package es.urjccode.mastercloudapps.adcs.draughts.annotations;

import es.urjccode.mastercloudapps.adcs.draughts.models.*;

public abstract class Controller {

    protected Session session;

    public Controller(Session session) {
        this.session = session;
    }

    public Color getColor(Coordinate coordinate) {
        assert coordinate != null;
        return ((SessionImplementation)this.session).getColor(coordinate);
    }

    public int getDimension() {
        return ((SessionImplementation)this.session).getDimension();
    }

}
