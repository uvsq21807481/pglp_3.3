package uvsq21807481;

import java.util.ArrayList;

public class Robot {

  private Position position;
  private Direction direction;
  private static ArrayList<Robot> allrobots = new ArrayList<Robot>();

  public Robot() {
    this.position = new Position(0, 0);
    this.direction = Direction.NORD;
    allrobots.add(this);
  }

  public Robot(Position p) {
    this.position = p;
    this.direction = Direction.NORD;
    allrobots.add(this);
  }

  public Robot(Direction d) {
    this.position = new Position(0, 0);
    this.direction = d;
    allrobots.add(this);
  }

  public Robot(Position p, Direction d) {
    this.position = p;
    this.direction = d;
    allrobots.add(this);
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
    for(Robot r : allrobots){
      r.avance();
    }
  }

  public Position getPosition() {
    return this.position;
  }

  public Direction getDirection() {
    return this.direction;
  }
}
