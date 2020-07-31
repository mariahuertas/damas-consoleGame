package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.IO;
import es.urjccode.mastercloudapps.adcs.draughts.views.Message;

public class MoveCommand extends Command {

    MoveCommand(PlayController playController) {
        super(CommandTitle.MOVE_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {

    }

    @Override
    public boolean isActive() {
        return true;
    }
}
