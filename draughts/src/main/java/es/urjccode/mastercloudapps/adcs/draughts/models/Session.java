package es.urjccode.mastercloudapps.adcs.draughts.models;

import java.util.List;

public interface Session {

    StateValue getValueState();

    boolean isBlocked();

    Color getColor(Coordinate coordinate);

    Color getTurnColor();

    Piece getPiece(Coordinate coordinate);

    int getDimension();

    String getName();

    void setName(String name);

}
