package uvsq21807481;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRobot {

  @Test
  public void testAvance(){
    Robot r = new Robot();
    r.avance();
    assertEquals(r.getPosition().posY, new Position(0, 1).posY);
  }

  @Test
  public void testTourne() {
    Robot r = new Robot();
    r.tourne();
    assertEquals(r.getDirection(), Direction.EST);
  }

  @Test
  public void testAvanceTous() {
    Robot r = new Robot();
    r.avancerTous();
    assertEquals(r.getPosition().posY, new Position(0, 1).posY);
  }
}
