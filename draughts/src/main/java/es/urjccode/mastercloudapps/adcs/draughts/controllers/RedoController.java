package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class RedoController  extends Controller{

    public RedoController(Session session) {
        super(session);
    }

    public void redo() {
        ((SessionImplementation) this.session).redo();
    }

    public boolean redoable() {
        return ((SessionImplementation) this.session).redoable();

    }

}
