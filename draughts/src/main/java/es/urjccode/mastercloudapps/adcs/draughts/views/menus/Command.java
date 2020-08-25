package es.urjccode.mastercloudapps.adcs.draughts.views.menus;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;


public abstract class Command extends es.urjccode.mastercloudapps.adcs.draughts.utils.Command {

    protected AceptorController aceptorController;

    protected Command(String title, AceptorController acceptorController) {
        super(title);
        this.aceptorController = acceptorController;
    }

}
