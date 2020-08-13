package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.Console;

abstract class SubView {

    protected Console console;

    public SubView(){
        this.console = new Console();
    }
    abstract void interact(AceptorController aceptorController);

}
