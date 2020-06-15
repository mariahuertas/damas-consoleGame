package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import java.util.List;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

	StartControllerImplementation(Session session) {
		super(session);
	}

	@Override
	public void start() {
        ((SessionImplementation) this.session).next();


        /* TODO
		((SessionImplementation)this.session).clearGame();
		((SessionImplementation)this.session).registry();
		this.sessionImplementationDAO.associate((SessionImplementation)this.session);
		((SessionImplementation) this.session).next();
		*/
	}
}
