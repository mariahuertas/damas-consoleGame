package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class ExitController extends Controller {

    public ExitController(Session session) {
        super(session);
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }

}
