package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.*;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;

@ControllerImplementation(StateValue.IN_GAME)
public class PlayControllerImplementation extends PlayController {

	private MoveController moveController;

	public PlayControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
		super(session);
		this.moveController = new MoveController((SessionImplementation) this.session);
	}

    public Error move(Coordinate... coordinates) {
        return this.moveController.move(coordinates);
    }

    @Override
    public void cancel() {
        this.cancelController.cancel();
    }

    public Color getColor() {
        return ((SessionImplementation)this.session).getTurnColor();
    }

    @Override
    public boolean isBlocked() {
        return false;
    }


}
