package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class CancelController extends Controller {

    public CancelController(SessionImplementation session) {
        super(session);
    }

    public void cancel() {
        ((SessionImplementation) this.session).cancel();
        ((SessionImplementation) this.session).next();

	}

}
