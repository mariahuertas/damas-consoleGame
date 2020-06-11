package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.utils.IO;

public class MoveCommand extends Command {

    MoveCommand(PlayController playController) {
        super(CommandTitle.MOVE_COMMAND.getTitle(), playController);
    }

    @Override
    protected void execute() {
        Error error;
        do {
            // TODO: example:
            //List<Color> colors = new ProposedCombinationView((PlayController)this.acceptorController).read();
            //error = ((PlayController)this.acceptorController).addProposedCombination(colors);
            error = null;  // remove after implementation
            if (error != null) {
                IO.writeError(Message.INVALID_MOVE, error.getMessage());
            }
        } while (error != null);
        //new GameView((PlayController)this.acceptorController);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
