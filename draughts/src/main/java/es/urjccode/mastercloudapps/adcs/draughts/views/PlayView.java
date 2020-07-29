package es.urjccode.mastercloudapps.adcs.draughts.views;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.PlayController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Error;
import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;

class PlayView extends SubView {

    private String string;

    PlayView() {
        super();
    }

    void interact(PlayController playController) {
        assert playController != null;
        Error error;
        do {
            error = null;
            this.string = this.read(playController.getColor());
            if (this.isCanceledFormat())
                playController.cancel();
            else if (!this.isMoveFormat()) {
                error = Error.BAD_FORMAT;
                this.writeError();
            } else {
                error = playController.move(this.getCoordinates());
                new GameView().write(playController);
                if (error == null && playController.isBlocked())
                    this.writeLost();
            }
        } while (error != null);
    }

    private String read(Color color) {
        final String titleColor = Message.PROMPT.replace(Message.COLOR_PARAM ,Message.COLOR_VALUES[color.ordinal()]);
        return this.console.readString(titleColor);
    }

    private boolean isCanceledFormat() {
        return string.equals(Message.CANCEL_FORMAT);
    }

    private boolean isMoveFormat() {
        return Pattern.compile(Message.MOVEMENT_FORMAT).matcher(string).find();
    }

    private void writeError(){
        this.console.writeln(Message.ERROR_MESSAGE);
    }

    private Coordinate[] getCoordinates() {
        assert this.isMoveFormat();
        List<Coordinate> coordinateList = new ArrayList<Coordinate>();
        while (string.length() > 0){
            coordinateList.add(Coordinate.getInstance(string.substring(0, 2)));
            string = string.substring(2, string.length());
            if (string.length() > 0 && string.charAt(0) == '.')
                string = string.substring(1, string.length());
        }
        Coordinate[] coordinates = new Coordinate[coordinateList.size()];
        for(int i=0; i< coordinates.length; i++){
            coordinates[i] = coordinateList.get(i);
        }
        return coordinates;
    }

    private void writeLost() {
        this.console.writeln(Message.LOST_MESSAGE);
    }

}
