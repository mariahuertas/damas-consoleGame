package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;

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
