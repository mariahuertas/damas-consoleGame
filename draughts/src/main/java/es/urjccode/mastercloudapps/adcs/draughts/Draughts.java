package es.urjccode.mastercloudapps.adcs.draughts;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.Logic;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation.LogicImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.views.View;

import java.lang.reflect.InvocationTargetException;

class Draughts {

    private View view;

    private Logic logic;

    private Draughts() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.view = new View();
        this.logic = new LogicImplementation();
    }

    private void play() {
        AceptorController acceptorController;
		do {
            acceptorController = this.logic.getController();
			if (acceptorController != null)
				this.view.interact(acceptorController);
		} while (acceptorController != null);
    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        new Draughts().play();
    }

}
