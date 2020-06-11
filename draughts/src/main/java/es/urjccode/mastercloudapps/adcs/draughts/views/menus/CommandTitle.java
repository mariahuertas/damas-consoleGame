package es.urjccode.mastercloudapps.adcs.draughts.views.menus;

public enum CommandTitle {
    MOVE_COMMAND("Move token"),
    UNDO_COMMAND("Undo move"),
    REDO_COMMAND("Redo move"),

    NEWGAME_COMMAND("Start a new game"),
    OPENGAME_COMMAND("Open a new game"),
    EXIT_COMMAND("Exit game");

    private String title;

    CommandTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
