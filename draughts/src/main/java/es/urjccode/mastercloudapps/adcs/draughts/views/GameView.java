package es.urjccode.mastercloudapps.adcs.draughts.views;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.AceptorController;
import es.urjccode.mastercloudapps.adcs.draughts.annotations.SubView;
import es.urjccode.mastercloudapps.adcs.draughts.controllers.MoveController;
import es.urjccode.mastercloudapps.adcs.draughts.models.Coordinate;
import es.urjccode.mastercloudapps.adcs.draughts.models.Piece;

class GameView extends SubView {

    void write(AceptorController controller) {
        assert controller != null;
        final int DIMENSION = controller.getDimension();
        this.writeNumbersLine(DIMENSION);
        for (int i = 0; i < DIMENSION; i++)
            this.writePiecesRow(i, controller);
        this.writeNumbersLine(DIMENSION);
    }

    private void writeNumbersLine(final int DIMENSION) {
        this.console.write(" ");
        for (int i = 0; i < DIMENSION; i++)
            this.console.write((i + 1) + "");
        this.console.writeln();
    }

    private void writePiecesRow(final int row, AceptorController controller) {
        this.console.write((row + 1) + "");
        for (int j = 0; j < controller.getDimension(); j++) {
            Piece piece = controller.getPiece(new Coordinate(row, j));
            if (piece == null)
                this.console.write(" ");
            else
                this.console.write(piece.getCode());
        }
        this.console.writeln((row + 1) + "");
    }

    @Override
    public void interact(AceptorController aceptorController) {

    }
}
