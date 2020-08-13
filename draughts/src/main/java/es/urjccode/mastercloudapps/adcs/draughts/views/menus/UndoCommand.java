package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class UndoCommand extends Command {

    public UndoCommand(AceptorController playController) {
        super(CommandTitle.UNDO_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
