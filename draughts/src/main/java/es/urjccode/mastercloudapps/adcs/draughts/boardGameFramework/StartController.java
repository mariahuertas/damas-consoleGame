package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.ControllerVisitor;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.Session;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.SessionImplementationDAO;
import es.urjccode.mastercloudapps.adcs.draughts.models.SessionImplementation;

public abstract class StartController extends AceptorController {

    protected SessionImplementationDAO sessionImplementationDAO;

    public StartController(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    public void start() {
        ((SessionImplementation) this.session).next();
    }

    public void start(String name) {
        this.sessionImplementationDAO.load(name);
    }

    public String[] getGamesNames() {
        return this.sessionImplementationDAO.getGamesNames();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        assert controllerVisitor != null;
        controllerVisitor.visit(this);
    }
}
