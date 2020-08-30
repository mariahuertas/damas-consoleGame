package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.Menu;

class GameSelectMenu extends Menu {

    GameSelectMenu(StartController startController) {
        super(startController);
        String[] gamesNames = startController.getGamesNames();
        for (String title : gamesNames) {
            this.addCommand(new GameSelectCommand(title, startController));
        }
    }

}
