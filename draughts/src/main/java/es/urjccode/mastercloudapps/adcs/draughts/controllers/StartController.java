package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public class StartController extends AceptorController {

	public StartController(Game game, State state) {
        super(game, state);
	}

	public void start() {
        this.state.next();
	}

    @Override
	public void accept(ControllerVisitor controllersVisitor) {
		assert controllersVisitor != null;
		controllersVisitor.visit(this);
    }

}
