package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class RedoController  extends Controller {

    public RedoController(SessionImplementation session) {
        super(session);
    }

    public void redo() {
        ((SessionImplementation) this.session).redo();
    }

    public boolean redoable() {
        return ((SessionImplementation) this.session).redoable();

    }

}
