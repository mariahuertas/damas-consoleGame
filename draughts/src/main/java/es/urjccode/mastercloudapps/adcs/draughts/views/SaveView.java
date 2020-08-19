package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.SaveController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.utils.IO;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;

@SubViewImplementation(StateValue.SAVING)
public class SaveView extends SubView {

    public SaveView(){
        super();
    }

    public void interact(AceptorController aceptorController) {
        boolean save = new YesNoDialog().read(Message.SAVE);
        String name = null;
        if (save) {
            if (((SaveController)aceptorController).hasName()) {
                ((SaveController)aceptorController).save();
            } else {
                boolean exists = false;
                do {
                    name = IO.readString(Message.NAME);
                    exists = ((SaveController)aceptorController).exists(name);
                    if (exists) {
                        IO.writeln(Message.NAME_EXISTS);
                    }
                } while (exists);
                ((SaveController)aceptorController).save(name);
            }
        }
        ((SaveController)aceptorController).next();
    }
}

