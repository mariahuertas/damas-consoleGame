package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.models.StateValue;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;

@SubViewImplementation(StateValue.FINAL)
class ResumeView extends SubView{

    public ResumeView(){
        super();
    }

    void interact(AceptorController aceptorController) {
        assert aceptorController != null;
        ((ResumeController)aceptorController).isNewGame(new YesNoDialog().read(Message.RESUME));
	}

}
