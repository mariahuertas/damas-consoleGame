package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;

public abstract class PlayController extends AceptorController {

    protected UndoController undoController;

    protected RedoController redoController;

    protected CancelController cancelController;

    protected ExitController exitController;

    protected PlayController(Session session) {super(session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
        this.cancelController = new CancelController(this.session);
        this.exitController = new ExitController(this.session);}

    public abstract void cancel();

    public abstract boolean isBlocked();

    public void next() {
        this.exitController.next();
    }

    public void undo() {
        this.undoController.undo();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

    @Override
    public void accept(ControllerVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
