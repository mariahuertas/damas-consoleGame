package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.StartMenu;

@SubViewImplementation(StateValue.INITIAL)
public class StartView extends SubView {

    public StartView(){
        super();
    }

    public void interact(AceptorController aceptorController) {
        assert aceptorController != null;
        this.console.writeln(Message.GAME_TITLE);
        this.console.writeln(Message.RULES);
        new StartMenu(aceptorController).execute();
        new GameView().write(aceptorController);
    }

}
