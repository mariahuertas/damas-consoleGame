package es.urjccode.mastercloudapps.adcs.draughts.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.DAOSerializer;
import es.urjccode.mastercloudapps.adcs.draughts.models.Board;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;

class GameDAO {

    private Game game;

    GameDAO(Game game) {
        this.game = game;
    }

    public void save() {
        try {
            DAOSerializer.serialize(this.game);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load(BufferedReader bufferedReader) {
        try {
            this.game = (Game)DAOSerializer.deserialize(this.game);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
