package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.Command;

@MenuCommand(PlayMenu.class)
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
