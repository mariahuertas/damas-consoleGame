package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SubViewImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ResumeController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.StateValue;
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
