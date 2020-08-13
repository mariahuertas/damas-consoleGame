package es.urjccode.mastercloudapps.adcs.draughts.models;

import es.urjccode.mastercloudapps.adcs.draughts.utils.Registry;

import java.util.List;

public class SessionImplementation implements Session{

    private State state;

    private Game game;

    private Registry registry;

    private String name;

    public SessionImplementation() {
        this.state = new State();
        this.game = new Game();
        this.registry = new Registry(this.game);
        this.name = null;
    }
    public SessionImplementation(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void resetGame() { this.game.reset();}

    public void resetState() {this.state.reset();}

    public Game getGame() {
        return this.game;
    }

    public void resetRegistry() {
        this.registry.reset();
    }

    public void setStateValue(StateValue value) {
        this.state.setStateValue(value);
    }

    public void resume() {
        this.game.reset();
        this.state.reset();
        this.name = null;
    }

    public Error move(Coordinate... coordinates) {
        Error error = this.game.move(coordinates);
        if (error == null) {
        }
        return error;
    }

    public void next() {
        this.state.next();
    }

    public boolean undoable() {
        return this.registry.undoable();
    }

    public boolean redoable() {
        return this.registry.redoable();
    }

    public void undo() {
        this.registry.undo(this.game);
    }

    public void redo() {
        this.registry.redo(this.game);
    }

    public void cancel() {
        this.game.cancel();
    }

    public boolean hasName() {
        return this.name != null;
    }

    @Override
    public boolean isBlocked() {
        return this.game.isBlocked();
    }

    @Override
    public Color getColor(Coordinate coordinate) {
        return this.game.getColor(coordinate);
    }

    @Override
    public Color getTurnColor() {
        return this.game.getTurnColor();
    }

    @Override
    public Piece getPiece(Coordinate coordinate) {
        return this.game.getPiece(coordinate);
    }

    @Override
    public int getDimension() {
        return this.game.getDimension();
    }

    @Override
    public StateValue getValueState() {
        return this.state.getValueState();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
