package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;

public class RedoCommand extends Command {

    public RedoCommand(PlayController playController) {
        super(CommandTitle.REDO_COMMAND.getTitle(), playController);
    }

    // TODO: remove comments when redo and redoable are added
    @Override
    protected void execute() {
        // ((PlayController) this.aceptorController).redo();
    }

    @Override
    public boolean isActive() {
        return true; // remove after implementation
        // return ((PlayController) this.aceptorController).redoable();
    }
}
