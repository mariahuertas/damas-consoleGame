package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.Command;

@MenuCommand(StartMenu.class)
public class NewGameCommand extends Command {

    public  NewGameCommand(AceptorController aceptorController) {
        super(CommandTitle.NEWGAME_COMMAND.getTitle(), aceptorController);
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
