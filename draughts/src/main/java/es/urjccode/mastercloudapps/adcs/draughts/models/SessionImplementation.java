package es.urjccode.mastercloudapps.adcs.draughts.models;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.State;


public class SessionImplementation extends Session {

    public SessionImplementation(Game game)
    {
        super(game);
    }
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
