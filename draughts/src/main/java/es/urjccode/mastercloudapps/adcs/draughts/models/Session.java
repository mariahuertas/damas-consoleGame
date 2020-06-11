package es.urjccode.mastercloudapps.adcs.draughts.models;

import java.util.List;

public interface Session {

    boolean isBlocked();

    Color getColor(Coordinate coordinate);

    Color getTurnColor();

    Piece getPiece(Coordinate coordinate);

    int getDimension();

}
