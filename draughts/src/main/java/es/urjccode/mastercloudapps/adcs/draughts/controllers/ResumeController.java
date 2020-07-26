package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public abstract class ResumeController extends AceptorController {

	public ResumeController(Session session) {
        super(session);
	}

    public abstract void isNewGame(boolean newGame);

    @Override
	public void accept(ControllerVisitor controllersVisitor) {
		assert controllersVisitor != null;
		controllersVisitor.visit(this);
	}

}
