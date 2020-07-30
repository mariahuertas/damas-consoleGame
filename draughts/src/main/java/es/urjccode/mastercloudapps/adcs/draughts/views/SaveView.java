package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.SaveController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.IO;
import es.urjccode.mastercloudapps.adcs.draughts.views.Message;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;

class SaveView {

    void interact(SaveController saveController) {
        boolean save = new YesNoDialog().read(Message.SAVE);
        String name = null;
        if (save) {
            if (saveController.hasName()) {
                saveController.save();
            } else {
                boolean exists = false;
                do {
                    name = IO.readString(Message.NAME);
                    exists = saveController.exists(name);
                    if (exists) {
                        IO.writeln(Message.NAME_EXISTS);
                    }
                } while (exists);
                saveController.save(name);
            }
        }
        saveController.next();
    }
}

