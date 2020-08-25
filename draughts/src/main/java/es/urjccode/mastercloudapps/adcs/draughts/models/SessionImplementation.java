package es.urjccode.mastercloudapps.adcs.draughts.models;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.State;

public class SessionImplementation extends Session {

    public SessionImplementation()
    {super();}
    public SessionImplementation(GameImplementation game, State state) {
        super(game, state);
    }

    public Error move(Coordinate... coordinates) {
        Error error = ((GameImplementation)this.game).move(coordinates);
        if (error == null) {
            this.registry.registry();
        }
        return error;
    }



    public Color getColor(Coordinate coordinate) {
        return ((GameImplementation)this.game).getColor(coordinate);
    }


    public Color getTurnColor() {
        return ((GameImplementation)this.game).getTurnColor();
    }


    public Piece getPiece(Coordinate coordinate) {
        return ((GameImplementation)this.game).getPiece(coordinate);
    }


    public int getDimension() {
        return ((GameImplementation)this.game).getDimension();
    }

}
