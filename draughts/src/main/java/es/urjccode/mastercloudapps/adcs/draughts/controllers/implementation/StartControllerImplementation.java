package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StartController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;

@ControllerImplementation(StateValue.INITIAL)
public class StartControllerImplementation extends StartController {

    public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
	    super(session, sessionImplementationDAO);
	}
}
