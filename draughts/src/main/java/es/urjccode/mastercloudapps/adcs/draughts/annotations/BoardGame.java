package es.urjccode.mastercloudapps.adcs.draughts.annotations;

import java.lang.reflect.InvocationTargetException;

class BoardGame {

    private View view;

    private Logic logic;

    private BoardGame()  {
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
        new BoardGame().play();
    }

}
