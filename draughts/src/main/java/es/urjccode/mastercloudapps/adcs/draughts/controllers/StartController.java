package es.urjccode.mastercloudapps.adcs.draughts.controllers;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class StartController extends AceptorController {

    public StartController(SessionImplementation session) {
        super(session);
    }

    public abstract void start();

    public abstract void start(String title);

    public abstract String[] getGamesNames();

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        assert controllerVisitor != null;
        controllerVisitor.visit(this);
    }
}
