package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class UndoController extends Controller {

    public UndoController(SessionImplementation session) {
        super(session);
    }

    public void undo() {
        ((SessionImplementation) this.session).undo();
    }

    public boolean undoable() {
        return ((SessionImplementation) this.session).undoable();

    }
}
