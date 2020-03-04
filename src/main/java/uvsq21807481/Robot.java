package uvsq21807481;

public class Robot extends RobotAbstrait{
  private Position position;
  private Direction direction;
  private static ListRobot listeR = new ListRobot();

  public Robot() {
    super();
    listeR.getArray().add(this);
    listeR.incNbRobot();
  }

  public Robot(Position p) {
    super(p);
    listeR.getArray().add(this);
    listeR.incNbRobot();
  }

  public Robot(Direction d) {
    super(d);
    listeR.getArray().add(this);
    listeR.incNbRobot();
  }

  public Robot(Position p, Direction d) {
    super(p, d);
    listeR.getArray().add(this);
    listeR.incNbRobot();
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

  @Override
  public void avance() {
    switch(direction){
      case NORD:
        position.posY++;
        break;
      case EST:
        position.posX++;
        break;
      case SUD:
        position.posY--;
        break;
      case OUEST:
        position.posX--;
        break;
      default:
        break;
    }
  }

  public void avancerTous(){
    for(int i = 0; i < listeR.getNbRobots(); i++){
      listeR.getArray().get(i).avance();
    }
  }

  public Position getPosition() {
    return this.position;
  }

  public Direction getDirection() {
    return this.direction;
  }
}
