package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

class ExitCommand extends Command {

    protected ExitCommand(AceptorController playController) {
        super(CommandTitle.EXIT_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
        ((PlayController) this.aceptorController).next();
    }

    @Override
    public boolean isActive() {
        return true;
    }

}

