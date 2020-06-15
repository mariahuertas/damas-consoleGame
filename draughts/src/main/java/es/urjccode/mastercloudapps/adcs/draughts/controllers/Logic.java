package es.urjccode.mastercloudapps.adcs.draughts.controllers;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;

import java.util.HashMap;
import java.util.Map;

import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;

public class Logic {

    protected Session session;

    protected Map<StateValue, AceptorController> acceptorControllers;

    protected Logic() {
        this.acceptorControllers = new HashMap<StateValue, AceptorController>();

	    /*
		this.game = new Game();
		this.state = new State();
        this.controllers = new HashMap<StateValue, AceptorController>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
		this.controllers.put(StateValue.IN_GAME, new PlayController(this.game, this.state));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.game, this.state));
		this.controllers.put(StateValue.EXIT, null);
	     */
	}

	public AceptorController getController() {
        return this.acceptorControllers.get(this.session.getValueState());
    }

}
