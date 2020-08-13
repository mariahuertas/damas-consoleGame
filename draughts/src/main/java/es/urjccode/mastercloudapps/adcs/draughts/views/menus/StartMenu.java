package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Menu;

public class StartMenu extends Menu {

    public StartMenu(AceptorController aceptorController) {
        this.addCommand(new NewGameCommand(aceptorController));
        this.addCommand(new OpenGameCommand(aceptorController));
    }
}

