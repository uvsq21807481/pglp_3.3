package uvsq21807481;

public class RobotStatique {

  private Position position;

  public RobotStatique(int x, int y) {
    position = new Position(x, y);
  }

  public Position getPosition() {
    return position;
  }
}
