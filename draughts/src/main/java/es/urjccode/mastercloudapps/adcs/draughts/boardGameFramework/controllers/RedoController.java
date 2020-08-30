package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;

public class RedoController  extends Controller {

    public RedoController(Session session) {
        super(session);
    }

    public void redo() {
         this.session.redo();
    }

    public boolean redoable() {
        return this.session.redoable();

    }

}
