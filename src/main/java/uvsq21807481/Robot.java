package uvsq21807481;

public abstract class Robot {
  private Position position;
  private Direction direction;

  public Robot() {
    this.position = new Position(0, 0);
    this.direction = Direction.NORD;
  }

  public Robot(Position p) {
    this.position = p;
    this.direction = Direction.NORD;
  }

  public Robot(Direction d) {
    this.position = new Position(0, 0);
    this.direction = d;
  }

  public Robot(Position p, Direction d){
    this.position = p;
    this.direction = d;
  }

  public void tourne() {
    switch(direction){
      case NORD:
        direction = Direction.EST;
        break;
      case EST:
        direction = Direction.SUD;
        break;
      case SUD:
        direction = Direction.OUEST;
        break;
      case OUEST:
        direction = Direction.NORD;
        break;
      default:
        break;
    }
  }
  public abstract void avance();
}
