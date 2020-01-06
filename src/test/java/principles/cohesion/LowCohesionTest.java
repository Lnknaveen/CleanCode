package principles.cohesion;

import org.junit.Test;

public class LowCohesionTest {

    @Test
    public void add() {
        LowCohesion lowCohesion = new LowCohesion();
        lowCohesion.add(10, 20);
    }

}