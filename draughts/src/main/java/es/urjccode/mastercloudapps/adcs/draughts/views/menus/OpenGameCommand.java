package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StartController;

class OpenGameCommand extends Command {

    protected OpenGameCommand(AceptorController aceptorController) {
        super(CommandTitle.OPENGAME_COMMAND.getTitle(), aceptorController);
    }

    @Override
    protected void execute() {
        new GameSelectMenu((StartController) this.aceptorController).execute();
    }

    @Override
    public boolean isActive() {
        return true;
    }

}
