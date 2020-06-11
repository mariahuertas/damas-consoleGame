package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.IO;

class GameSelectCommand extends Command {


    protected GameSelectCommand(String title, StartController startController) {
        super(title, startController);
    }

    @Override
    protected void execute() {
        IO.writeln(this.title);
        //((StartController) this.aceptorController).start(this.title);
    }

    @Override
    public boolean isActive() {
        return true;
    }

}
