package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;

public class ExitController extends Controller {

    public ExitController(Session session) {
        super(session);
    }

    public void next() {
         this.session.next();
    }

}
