package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.StartMenu;

@SubViewImplementation(StateValue.INITIAL)
class StartView extends SubView {

    public StartView(){
        super();
    }

    void interact(AceptorController aceptorController) {
        assert aceptorController != null;
        this.console.writeln(Message.GAME_TITLE);
        this.console.writeln(Message.RULES);
        new StartMenu(aceptorController).execute();
        new GameView().write(aceptorController);
    }

}
