package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

@ControllerImplementation(StateValue.FINAL)
public class ResumeControllerImplementation extends ResumeController {

	public ResumeControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
		super(session);
	}

	public void isNewGame(boolean newGame) {
		if (newGame) {
			((SessionImplementation) this.session).resume();
		} else {
			((SessionImplementation) this.session).next();
		}
	}

}
