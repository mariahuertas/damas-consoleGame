package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Menu;

public class StartMenu extends Menu {

    public StartMenu(StartController startController) {
        this.addCommand(new NewGameCommand(startController));
        this.addCommand(new OpenGameCommand(startController));
    }
}

