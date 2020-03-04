package uvsq21807481;

import java.util.ArrayList;

public class ListRobot {
  private ArrayList<Robot> listeRobots;
  private int nbRobots;

  public void ListRobot(){
    listeRobots = new ArrayList<Robot>();
  }

  public ArrayList<Robot> getArray() {
    return listeRobots;
  }

  public int getNbRobots() {
    return nbRobots;
  }

  public void incNbRobot() {
    this.nbRobots++;
  }

  public void dexNbRobot() {
    this.nbRobots--;
  }
}
