package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.*;
import es.urjccode.mastercloudapps.adcs.draughts.utils.YesNoDialog;

public class View implements ControllerVisitor {

    private StartView startView;
    private PlayView playView;
    private SaveView saveView;
    private ResumeView resumeView;

    public View(){
        this.startView = new StartView();
        this.playView = new PlayView();
        this.saveView = new SaveView();
        this.resumeView = new ResumeView();
    }

    public void interact(AceptorController controller) {
        assert controller != null;
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        assert startController != null;
        this.startView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) {
        assert playController != null;
        this.playView.interact(playController);
    }

    @Override
    public void visit(SaveController saveController) {
        this.saveView.interact(saveController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
}
