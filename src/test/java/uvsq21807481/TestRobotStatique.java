package uvsq21807481;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRobotStatique {

   @Test
  public void testConst(){
     RobotStatique rs = new RobotStatique(0, 0);
     assertEquals(rs.getPosition(), new Position(0 , 0 ));
   }
}
