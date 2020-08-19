package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class ExitController extends Controller {

    public ExitController(SessionImplementation session) {
        super(session);
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }

}
