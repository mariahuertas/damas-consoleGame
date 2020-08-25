package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.PlayMenu;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SubViewImplementation;


@SubViewImplementation(StateValue.IN_GAME)
public class PlayView extends SubView {

    public PlayView() {
        super();
    }

    public void interact(AceptorController aceptorController) {
        new PlayMenu(aceptorController).execute();
        new GameView().write(aceptorController);
    }


}
