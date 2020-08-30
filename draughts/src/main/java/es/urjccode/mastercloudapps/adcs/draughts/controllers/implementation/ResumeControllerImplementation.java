package es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.ControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.DAO.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.StateValue;

@ControllerImplementation(StateValue.FINAL)
public class ResumeControllerImplementation extends ResumeController {

	public ResumeControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
		super(session);
	}
}
