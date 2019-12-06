package es.urjccode.mastercloudapps.adcs.draughts.models;

class Draught extends Piece {

  private static char[] CHARACTERS = { 'B', 'N' };

  Draught(Color color) {
    super(color);
  }

  @Override
  Error isCorrectDiagonalMovement(int amountBetweenDiagonalPieces, int pair, Coordinate... coordinates) {
    if (amountBetweenDiagonalPieces > 1)
      return Error.TOO_MUCH_EATINGS;
    return null;
  }

  @Override
  protected char[] getCodes() {
    return Draught.CHARACTERS;
  }

}