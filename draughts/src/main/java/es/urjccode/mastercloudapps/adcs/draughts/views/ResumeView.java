package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;

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
