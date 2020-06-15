package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Game;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;
import es.urjccode.mastercloudapps.adcs.draughts.models.State;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;

public abstract class AceptorController extends Controller {

    AceptorController(Session session) {
        super(session);
    }

	public Piece getPiece(Coordinate coordinate) {
        return this.session.getPiece(coordinate);
        }

	abstract public void accept(ControllerVisitor controllersVisitor);

}
