package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.Command;

@MenuCommand(PlayMenu.class)
public class ExitCommand extends Command {

    public ExitCommand(AceptorController playController) {
        super(CommandTitle.EXIT_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
        ((PlayController) this.aceptorController).next();
    }

    @Override
    public boolean isActive() {
        return true;
    }

}

