package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.PlayMenu;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.SubViewImplementation;


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
