package es.urjccode.mastercloudapps.adcs.draughts.controllers;

import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.models.*;

public abstract class PlayController extends AceptorController {

    protected PlayController(Session session) {super(session);}

    public abstract Error move(Coordinate... coordinates);

    public abstract void cancel();

    public abstract Color getColor();

    public abstract boolean isBlocked();

    public abstract void undo();

    public abstract void redo();

    public abstract boolean undoable();

    public abstract boolean redoable();

    public abstract void next();

    @Override
    public void accept(ControllerVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
