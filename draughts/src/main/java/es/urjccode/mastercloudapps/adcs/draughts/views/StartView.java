package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.StartMenu;

class StartView extends SubView {

    StartView(){
        super();
    }

    void interact(StartController startController) {
        assert startController != null;
        this.console.writeln(Message.GAME_TITLE);
        this.console.writeln(Message.RULES);
        new StartMenu(startController).execute();
        new GameView().write(startController);
    }

}
