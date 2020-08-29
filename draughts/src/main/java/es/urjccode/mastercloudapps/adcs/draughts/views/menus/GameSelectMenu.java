package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.Menu;

class GameSelectMenu extends Menu {

    GameSelectMenu(StartController startController) {
        String[] gamesNames = startController.getGamesNames();
        for (String title : gamesNames) {
            this.addCommand(new GameSelectCommand(title, startController));
        }
    }

}
