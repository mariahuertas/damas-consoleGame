package es.urjccode.mastercloudapps.adcs.draughts.controllers;
import es.urjccode.mastercloudapps.adcs.draughts.models.Session;

public abstract class StartController extends AceptorController {

    public StartController(Session session) {
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
