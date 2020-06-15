package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import java.util.List;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.MoveController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;

public class PlayControllerImplementation extends PlayController {

	private MoveController moveController;

	//private UndoController undoController;

	//private RedoController redoController;

	private ResumeController resumeController;

	PlayControllerImplementation(Session session) {
		super(session);
		this.moveController = new MoveController(this.session);
		//this.undoController = new UndoController(this.session);
		//this.redoController = new RedoController(this.session);
		//this.resumeController = new ResumeController(this.session);
	}

	@Override
    public Error move(Coordinate... coordinates) {
        return this.moveController.move(coordinates);
    }

    @Override
    public void next() {
        this.state.next();
        //TODO: this.exitController.next();
    }
/*
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

	@Override
	public boolean isWinner() {
		return this.proposalController.isWinner();
	}

	@Override
	public boolean isLooser() {
		return this.proposalController.isLooser();
	}
*/

}
