package es.urjccode.mastercloudapps.adcs.draughts.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import es.urjccode.mastercloudapps.adcs.draughts.models.Board;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;

class GameDAO implements DAO {

	private Game game;

	GameDAO(Game game) {
		this.game = game;
	}

	public void save(FileWriter fileWriter) {
 		try {
            fileWriter.write(this.game.getTurnColor() + "\n");
            new BoardDAO(this.game.getBoard()).save(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {

	}

}
