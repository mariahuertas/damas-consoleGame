package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;

class OpenGameCommand extends Command {

    protected OpenGameCommand(StartController startController) {
        super(CommandTitle.OPENGAME_COMMAND.getTitle(), startController);
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
