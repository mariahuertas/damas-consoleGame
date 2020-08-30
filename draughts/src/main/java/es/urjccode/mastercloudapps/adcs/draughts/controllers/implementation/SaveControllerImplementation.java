package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.SaveController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.DAO.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.StateValue;

@ControllerImplementation(StateValue.SAVING)
public class SaveControllerImplementation extends SaveController {

    public SaveControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session, sessionImplementationDAO);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

}
