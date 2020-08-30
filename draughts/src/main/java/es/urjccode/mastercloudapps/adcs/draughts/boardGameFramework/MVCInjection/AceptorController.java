package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.Controller;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;

public abstract class AceptorController extends Controller {

    public AceptorController(Session session) {
        super(session);
    }

	abstract public void accept(ControllerVisitor controllersVisitor);

}
