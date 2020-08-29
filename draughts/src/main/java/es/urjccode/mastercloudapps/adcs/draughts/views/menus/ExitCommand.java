package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.Command;

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

