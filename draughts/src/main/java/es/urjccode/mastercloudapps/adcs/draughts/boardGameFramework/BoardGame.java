package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

import es.urjccode.mastercloudapps.adcs.draughts.models.GameImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.LogicImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class BoardGame {

    protected View view;

    protected Logic logic;

    public BoardGame()  {
        this.view = new View();
        this.logic = new LogicImplementation(new SessionImplementation(new GameImplementation()));
    }

    public void play() {
        AceptorController acceptorController;
		do {
            acceptorController = this.logic.getController();
			if (acceptorController != null)
				this.view.interact(acceptorController);
		} while (acceptorController != null);
    }
}
