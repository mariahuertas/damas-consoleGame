package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;

@ControllerImplementation(StateValue.FINAL)
public class ResumeControllerImplementation extends ResumeController {

	public ResumeControllerImplementation(Session session) {
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
