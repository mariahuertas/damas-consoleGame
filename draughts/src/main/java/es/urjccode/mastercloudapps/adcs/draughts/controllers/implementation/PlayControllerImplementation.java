package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;

@ControllerImplementation(StateValue.IN_GAME)
public class PlayControllerImplementation extends PlayController {

	private MoveController moveController;

	private UndoController undoController;

	private RedoController redoController;

	private CancelController cancelController;

	private ExitController exitController;

	public PlayControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
		super(session);
		this.moveController = new MoveController((SessionImplementation) this.session);
		this.undoController = new UndoController((SessionImplementation) this.session);
		this.redoController = new RedoController((SessionImplementation) this.session);
		this.cancelController = new CancelController((SessionImplementation) this.session);
		this.exitController = new ExitController((SessionImplementation) this.session);
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
        return ((SessionImplementation)this.session).getTurnColor();
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
