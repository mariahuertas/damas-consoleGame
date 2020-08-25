package es.urjccode.mastercloudapps.adcs.draughts.boardGameFramework;


import es.urjccode.mastercloudapps.adcs.draughts.models.GameImplementation;

class GameDAO implements DAO {

    private Game game;

    GameDAO(Game game) {
        this.game = game;
    }

    @Override
    public void save() {
        try {
            DAOSerializer.serialize(this.game);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load() {
        try {
            this.game = (Game)DAOSerializer.deserialize(this.game);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
