package cohesion;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighCohesionTest {

    @Test
    public void add() {
        HighCohesion highCohesion = new HighCohesion();
        int sum = highCohesion.add(10, 20);

        Console.print(sum + "");
    }
}