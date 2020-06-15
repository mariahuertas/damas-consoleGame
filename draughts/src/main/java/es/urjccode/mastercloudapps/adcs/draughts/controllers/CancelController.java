package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;

public class CancelController extends Controller {

    public CancelController(Session session) {
        super(session);
    }

    public void cancel() {
        ((SessionImplementation) this.session).cancel();
        ((SessionImplementation) this.session).next();

	}

}
