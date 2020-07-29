package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.SaveController;
import es.urjccode.mastercloudapps.adcs.draughts.views.Message;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;
class SaveView {
    void interact(SaveController saveController) {
    }
}
/*
class SaveView extends WithConsoleView {

	void interact(SaveController saveController) {
		boolean save = new YesNoDialog().read(MessageView.SAVE.getMessage());
		String name = null;
		if (save) {
			if (saveController.hasName()) {
				saveController.save();
			} else {
				boolean exists = false;
				do {
					name = this.console.readString(MessageView.NAME.getMessage());
					exists = saveController.exists(name);
					if (exists) {
						this.console.writeln("The proposed name already exists");
					}
				} while (exists);
				saveController.save(name);
			}
		}
		saveController.next();
	}

}
 */
