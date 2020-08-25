package es.urjccode.mastercloudapps.adcs.draughts.annotations;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;

import java.util.HashMap;
import java.util.Map;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.StateValue;

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
