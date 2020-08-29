package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SaveController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;

@ControllerImplementation(StateValue.SAVING)
public class SaveControllerImplementation extends SaveController {

    public SaveControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session, sessionImplementationDAO);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

}
