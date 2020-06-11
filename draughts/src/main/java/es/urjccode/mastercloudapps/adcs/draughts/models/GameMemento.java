package es.urjccode.mastercloudapps.adcs.draughts.models;


import es.urjccode.mastercloudapps.adcs.draughts.utils.Memento;

public class GameMemento extends Memento {

    private Board board;
    private Turn turn;

    public GameMemento() {
    }

    public Board getBoard() {
        return this.board;
    }

    public Turn getTurn() {
        return this.turn;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }
}
