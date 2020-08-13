package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.controllers.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Color;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MoveView extends SubView {


    public String read(Color color) {
        final String titleColor = Message.PROMPT.replace(Message.COLOR_PARAM ,Message.COLOR_VALUES[color.ordinal()]);
        return this.console.readString(titleColor);
    }

    public boolean isCanceledFormat(String string) {
        return string.equals(Message.CANCEL_FORMAT);
    }

    public boolean isMoveFormat(String string) {
        return Pattern.compile(Message.MOVEMENT_FORMAT).matcher(string).find();
    }

    public void writeError(){
        this.console.writeln(Message.ERROR_MESSAGE);
    }

    public Coordinate[] getCoordinates(String string) {
        assert this.isMoveFormat(string);
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

    public void writeLost() {
        this.console.writeln(Message.LOST_MESSAGE);
    }

    @Override
    void interact(AceptorController aceptorController) {

    }
}
