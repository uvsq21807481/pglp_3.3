package uvsq21807481;

public abstract class RobotAbstrait {
  protected Position position;
  protected Direction direction;

  public RobotAbstrait() {
    this.position = new Position(0, 0);
    this.direction = Direction.NORD;
  }

  public RobotAbstrait(Position p) {
    this.position = p;
    this.direction = Direction.NORD;
  }

  public RobotAbstrait(Direction d) {
    this.position = new Position(0, 0);
    this.direction = d;
  }

  public RobotAbstrait(Position p, Direction d){
    this.position = p;
    this.direction = d;
  }

  public void avance(){}
}