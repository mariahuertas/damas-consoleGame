package es.urjccode.mastercloudapps.adcs.draughts;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.Logic;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.views.View;

class Draughts {

    private View view;

    private Logic logic;

    private Draughts(){
        this.view = new View();
        this.logic = new Logic();
    }

    private void play() {
        AceptorController acceptorController;
		do {
            acceptorController = this.logic.getController();
			if (acceptorController != null)
				this.view.interact(acceptorController);
		} while (acceptorController != null);
    }

    public static void main(String[] args){
        new Draughts().play();
    }

}
