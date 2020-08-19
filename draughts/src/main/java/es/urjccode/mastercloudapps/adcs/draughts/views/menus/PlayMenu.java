package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Menu;

public class PlayMenu extends Menu {

    public PlayMenu(AceptorController playController) {
        this.addCommand(new MoveCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
        this.addCommand(new ExitCommand(playController));
    }

}
