package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class UndoCommand extends Command {

    public UndoCommand(PlayController playController) {
        super(CommandTitle.UNDO_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
       // ((PlayController) this.aceptorController).undo();
    }

    @Override
    public boolean isActive() {
        return true;
       // return ((PlayController) this.aceptorController).undoable();
    }
}