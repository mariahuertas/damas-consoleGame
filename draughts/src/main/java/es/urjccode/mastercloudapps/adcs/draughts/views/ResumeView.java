package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.models.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.utils.YesNoDialog;

@SubViewImplementation(StateValue.FINAL)
public class ResumeView extends SubView {

    public ResumeView(){
        super();
    }

    public void interact(AceptorController aceptorController) {
        assert aceptorController != null;
        ((ResumeController)aceptorController).isNewGame(new YesNoDialog().read(Message.RESUME));
	}

}
