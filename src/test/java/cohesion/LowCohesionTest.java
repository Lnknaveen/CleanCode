package cohesion;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowCohesionTest {

    @Test
    public void add() {
        LowCohesion lowCohesion = new LowCohesion();
        lowCohesion.add(10, 20);
    }

}