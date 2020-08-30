package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;

public class CancelController extends Controller {

    public CancelController(Session session) {
        super(session);
    }

    public void cancel() {
        this.session.cancel();
        this.session.next();

	}

}
