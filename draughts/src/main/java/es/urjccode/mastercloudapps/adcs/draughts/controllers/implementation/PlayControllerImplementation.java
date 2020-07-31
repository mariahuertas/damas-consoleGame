package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import java.util.List;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;

public class PlayControllerImplementation extends PlayController {

	private MoveController moveController;

	private UndoController undoController;

	private RedoController redoController;

	private CancelController cancelController;

	private ExitController exitController;

	public PlayControllerImplementation(Session session) {
		super(session);
		this.moveController = new MoveController(this.session);
		this.undoController = new UndoController(this.session);
		this.redoController = new RedoController(this.session);
		this.cancelController = new CancelController(this.session);
		this.exitController = new ExitController(this.session);
	}

	@Override
    public Error move(Coordinate... coordinates) {
        return this.moveController.move(coordinates);
    }

    @Override
    public void cancel() {
        this.cancelController.cancel();
    }

    @Override
    public Color getColor() {
        return this.session.getTurnColor();
    }

    @Override
    public boolean isBlocked() {
        return false;
    }

    @Override
    public void next() {
	    this.exitController.next();
	}

	@Override
	public void undo() {
		this.undoController.undo();
	}

	@Override
	public void redo() {
		this.redoController.redo();
	}

	@Override
	public boolean undoable() {
		return this.undoController.undoable();
	}

	@Override
	public boolean redoable() {
		return this.redoController.redoable();
	}

}
