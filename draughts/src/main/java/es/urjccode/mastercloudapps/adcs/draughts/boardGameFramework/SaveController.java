package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class SaveController extends AceptorController {

    protected  SessionImplementationDAO sessionImplementationDAO;

    public SaveController(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    public void save(String name) {
        this.sessionImplementationDAO.save(name);
    }

    public void save() {
        this.sessionImplementationDAO.save();
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }

    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    public boolean exists(String name) {
        return this.sessionImplementationDAO.exists(name);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
