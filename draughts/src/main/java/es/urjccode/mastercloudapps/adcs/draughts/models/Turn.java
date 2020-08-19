package es.urjccode.mastercloudapps.adcs.draughts.models;

import es.urjccode.mastercloudapps.adcs.draughts.annotations.MementoAttribute;

import java.io.Serializable;

public class Turn extends MementoAttribute implements Serializable {

  private Color color;

  public Turn() {
    this.color = Color.WHITE;
  }

  void change() {
    this.color = this.getOppositeColor();
  }

  void addTurn(String turn) {
      if (turn.equals("BLACK")) {
          this.color = Color.BLACK;
      }
      else {
          this.color = Color.WHITE;
      }
  }

  Color getColor() {
    return this.color;
  }

  Color getOppositeColor() {
    return Color.values()[(this.color.ordinal() + 1) % 2];
  }

  @Override
  public String toString() {
    return this.color.name();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Turn other = (Turn) obj;
    if (color != other.color)
      return false;
    return true;
  }

    @Override
    public void initializeMemento(MementoAttribute mementoAttribute) {
        Turn mementoTurn = (Turn) mementoAttribute;
        this.color = mementoTurn.getColor();
    }
}
