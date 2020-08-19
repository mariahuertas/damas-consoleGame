package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;

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
