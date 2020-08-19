package es.urjccode.mastercloudapps.adcs.draughts.annotations;


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
            this.game = (GameImplementation)DAOSerializer.deserialize(this.game);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
