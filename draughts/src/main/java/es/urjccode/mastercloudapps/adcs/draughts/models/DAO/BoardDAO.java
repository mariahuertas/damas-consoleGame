package es.urjccode.mastercloudapps.adcs.draughts.models.DAO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

import es.urjccode.mastercloudapps.adcs.draughts.models.Board;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;

class BoardDAO implements DAO {

	private Board board;

	BoardDAO(Board board) {
		this.board = board;
	}

	public void save(FileWriter fileWriter) {
        try {
            String string = "";
            for (int i = 0; i < Coordinate.getDimension(); i++)
                string += this.toStringHorizontalPieces(i);
            fileWriter.write(string);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void load(BufferedReader bufferedReader) {

	}

	public Board getBoard() {
		return this.board;
	}

    private String toStringHorizontalPieces(int row) {
        String string = " ";
        for (int j = 0; j < Coordinate.getDimension(); j++) {
            Piece piece = getBoard().getPiece(new Coordinate(row, j));
            if (piece == null)
                string += " ";
            else {
                string += piece;
            }
        }
        return string + "\n";
    }

}
