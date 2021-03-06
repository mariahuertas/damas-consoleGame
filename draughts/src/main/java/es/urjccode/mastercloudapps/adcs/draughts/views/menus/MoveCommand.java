package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.MVCInjection.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.MenuCommand;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework.menu.Command;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.implementation.PlayControllerImplementation;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.views.MoveView;

@MenuCommand(PlayMenu.class)
public class MoveCommand extends Command {

    public MoveCommand(AceptorController playController) {
        super(CommandTitle.MOVE_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
        assert ((PlayController)this.aceptorController) != null;
        Error error;
        MoveView moveView = new MoveView();
        do {
            error = null;
            String string = moveView.read(((PlayControllerImplementation)this.aceptorController).getColor());
            if (moveView.isCanceledFormat(string))
                ((PlayController)this.aceptorController).cancel();
            else if (!moveView.isMoveFormat(string)) {
                error = Error.BAD_FORMAT;
                moveView.writeError();
            } else {
                error = ((PlayControllerImplementation)this.aceptorController).move(moveView.getCoordinates(string));
                if (error == null && ((PlayController)this.aceptorController).isBlocked())
                    moveView.writeLost();
            }
        } while (error != null);

    }

    @Override
    public boolean isActive() {
        return true;
    }
}
