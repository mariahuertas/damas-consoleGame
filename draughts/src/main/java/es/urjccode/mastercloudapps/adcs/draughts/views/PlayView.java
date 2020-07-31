package es.urjccode.mastercloudapps.adcs.draughts.views;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.PlayMenu;
import es.urjccode.mastercloudapps.adcs.draughts.views.menus.StartMenu;

class PlayView extends SubView {

    PlayView() {
        super();
    }

    void interact(PlayController playController) {
        new PlayMenu(playController).execute();
        new GameView().write(playController);
    }


}
