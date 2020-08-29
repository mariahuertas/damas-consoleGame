package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class ExitController extends Controller {

    public ExitController(Session session) {
        super(session);
    }

    public void next() {
         this.session.next();
    }

}
