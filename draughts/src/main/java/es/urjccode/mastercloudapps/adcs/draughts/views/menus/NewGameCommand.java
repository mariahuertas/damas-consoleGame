package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.Command;

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
