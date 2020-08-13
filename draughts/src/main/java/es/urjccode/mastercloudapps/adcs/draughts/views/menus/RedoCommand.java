package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class RedoCommand extends Command {

    public RedoCommand(AceptorController playController) {
        super(CommandTitle.REDO_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
