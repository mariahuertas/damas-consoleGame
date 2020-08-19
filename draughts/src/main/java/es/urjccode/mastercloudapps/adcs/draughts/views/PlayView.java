package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.PlayMenu;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;


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
