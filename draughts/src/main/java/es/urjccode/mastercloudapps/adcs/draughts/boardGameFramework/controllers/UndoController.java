package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;

public class UndoController extends Controller {

    public UndoController(Session session) {
        super(session);
    }

    public void undo() {
         this.session.undo();
    }

    public boolean undoable() {
        return this.session.undoable();

    }
}
