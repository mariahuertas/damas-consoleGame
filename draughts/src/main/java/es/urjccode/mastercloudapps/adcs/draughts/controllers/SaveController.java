package es.urjccode.mastercloudapps.adcs.draughts.controllers;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.Session;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class SaveController extends AceptorController {

    public SaveController(SessionImplementation session) {
        super(session);
    }

    public abstract void save(String name);

    public abstract void save();

    public abstract void next();

    public abstract boolean hasName();

    public abstract boolean exists(String readString);

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
