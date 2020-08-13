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
	}

	public AceptorController getController() {
        return this.acceptorControllers.get(this.session.getValueState());
    }

}
