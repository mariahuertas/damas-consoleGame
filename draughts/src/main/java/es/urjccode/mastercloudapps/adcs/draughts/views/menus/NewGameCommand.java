package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;

class NewGameCommand extends Command {

    protected NewGameCommand(StartController startController) {
        super(CommandTitle.NEWGAME_COMMAND.getTitle(), startController);
    }

    @Override
    protected void execute() {
        ((StartController) this.aceptorController).start();
    }

    @Override
    public boolean isActive() {
        return true;
    }

}
