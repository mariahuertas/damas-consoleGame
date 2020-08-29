package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.Command;

@MenuCommand(PlayMenu.class)
public class RedoCommand extends Command {

    public RedoCommand(AceptorController playController) {
        super(CommandTitle.REDO_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
        ((PlayController)this.aceptorController).redo();
    }

    @Override
    public boolean isActive() {
        return ((PlayController)this.aceptorController).redoable();

    }
}
