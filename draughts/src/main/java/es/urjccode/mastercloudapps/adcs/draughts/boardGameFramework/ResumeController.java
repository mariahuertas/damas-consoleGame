package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class ResumeController extends AceptorController {

	public ResumeController(Session session) {
        super(session);
	}

    public void isNewGame(boolean newGame) {
        if (newGame) {
            ((SessionImplementation) this.session).resume();
        } else {
            ((SessionImplementation) this.session).next();
        }
    }

    @Override
	public void accept(ControllerVisitor controllersVisitor) {
		assert controllersVisitor != null;
		controllersVisitor.visit(this);
	}

}
