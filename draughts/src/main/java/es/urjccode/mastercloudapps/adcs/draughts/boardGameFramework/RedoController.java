package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

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
