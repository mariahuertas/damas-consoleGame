package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.PlayMenu;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;


@SubViewImplementation(StateValue.IN_GAME)
class PlayView extends SubView {

    public PlayView() {
        super();
    }

    void interact(AceptorController aceptorController) {
        new PlayMenu(aceptorController).execute();
        new GameView().write(aceptorController);
    }


}
