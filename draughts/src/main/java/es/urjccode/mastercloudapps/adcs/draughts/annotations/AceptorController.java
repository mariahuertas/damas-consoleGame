package es.urjccode.mastercloudapps.adcs.draughts.annotations;

public abstract class AceptorController extends Controller {

    public AceptorController(Session session) {
        super(session);
    }

	abstract public void accept(ControllerVisitor controllersVisitor);

}
