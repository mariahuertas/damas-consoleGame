package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public class CancelController extends Controller {

    public CancelController(Session session) {
        super(session);
    }

    public void cancel() {
        this.session.cancel();
        this.session.next();

	}

}
