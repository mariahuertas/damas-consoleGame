package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

	public ResumeControllerImplementation(Session session) {
		super(session);
	}

	/*@Override
	public void isNewGame(boolean newGame) {
		if (newGame) {
			((SessionImplementation) this.session).isNewGame();
		} else {
			((SessionImplementation) this.session).next();
		}
	}
*/
	@Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }
    @Override
    public void reset() {
        ((SessionImplementation) this.session).resetGame();
        ((SessionImplementation) this.session).resetState();
    }

}
