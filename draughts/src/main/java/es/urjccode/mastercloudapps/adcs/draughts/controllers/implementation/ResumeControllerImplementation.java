package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import mastermind.controllers.ResumeController;
import mastermind.models.Session;
import mastermind.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	ResumeControllerImplementation(Session session) {
		super(session);
	}

	@Override
	public void isNewGame(boolean newGame) {
		if (newGame) {
			((SessionImplementation) this.session).isNewGame();
		} else {
			((SessionImplementation) this.session).next();
		}
	}

}
