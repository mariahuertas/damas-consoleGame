package es.urjccode.mastercloudapps.adcs.draughts.annotations;

import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class AceptorController extends Controller {

    public AceptorController(Session session) {
        super(session);
    }

	public Piece getPiece(Coordinate coordinate) {
        return ((SessionImplementation)this.session).getPiece(coordinate);
        }

	abstract public void accept(ControllerVisitor controllersVisitor);

}
