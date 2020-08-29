package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.Command;

public class UndoCommand extends Command {

    public UndoCommand(AceptorController playController) {
        super(CommandTitle.UNDO_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
        ((PlayController)this.aceptorController).undo();
    }

    @Override
    public boolean isActive() {
        return ((PlayController)this.aceptorController).undoable();

    }
}
