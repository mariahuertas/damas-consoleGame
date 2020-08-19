package es.urjccode.mastercloudapps.adcs.draughts.annotations;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

public abstract class SubView {

    protected Console console;

    public SubView(){
        this.console = new Console();
    }
    public abstract void interact(AceptorController aceptorController);

}
