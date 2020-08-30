package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.DAO.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.StateValue;

@ControllerImplementation(StateValue.INITIAL)
public class StartControllerImplementation extends StartController {

    public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
	    super(session, sessionImplementationDAO);
	}
}
