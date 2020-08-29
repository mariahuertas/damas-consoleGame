package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;


import java.util.HashMap;

public class GameMemento {

    HashMap<String, Object> mementoFields;

    public GameMemento() {
    }

    public void setMemento(HashMap<String, Object> mementoFields){
        this.mementoFields = mementoFields;
    }

    public HashMap<String, Object> getMemento(){
        return this.mementoFields;
    }

}
