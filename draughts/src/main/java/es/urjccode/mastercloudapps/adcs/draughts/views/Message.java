package es.urjccode.mastercloudapps.adcs.draughts.views;

public class Message {
    public static final String GAME_TITLE = "*********************DAMAS**********************";
    public static final String RULES = "RULES: coordenadaActual.coordenadaFinal (filaColumna) ej: 61.52";
    public static final String GAME_END = "**************************************************";

    public static final String EMPTY = "empty";

    public static final String RESUME = "Do you want to resume?";

    // DAO
    public static final String SAVE = "Do you want to save the game?";
    public static final String NAME = "Name: ";
    public static final String NAME_EXISTS = "The proposed name already exists";

    // VIEWS
    public static final String COLOR_PARAM = "#color";
    public static final String[] COLOR_VALUES = { "blancas", "negras" };
    public static final String PROMPT = "Mueven las " + Message.COLOR_PARAM + ": ";
    public static final String CANCEL_FORMAT = "-1";
    public static final String MOVEMENT_FORMAT = "[1-8]{2}(\\.[1-8]{2}){1,2}";
    public static final String ERROR_MESSAGE = "Error!!! Formato incorrecto";
    public static final String LOST_MESSAGE = "Derrota!!! No puedes mover tus fichas!!!";

    // MENU
    public static final String INVALID_MOVE = "Invalid move";
}
