package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import java.util.List;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.models.DAO.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;

@ControllerImplementation(StateValue.INITIAL)
public class StartControllerImplementation extends StartController {

    private final SessionImplementationDAO sessionImplementationDAO;

    public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
	    super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
	}

	@Override
	public void start() {
        ((SessionImplementation) this.session).next();
	}

    @Override
    public void start(String name) {
        this.sessionImplementationDAO.load(name);
    }

    @Override
    public String[] getGamesNames() {
        return this.sessionImplementationDAO.getGamesNames();
    }
}
