package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
        assert resumeController != null;
        resumeController.isNewGame(new YesNoDialog().read(Message.RESUME));
	}

}
