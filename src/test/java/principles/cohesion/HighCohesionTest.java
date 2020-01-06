package principles.cohesion;

import org.junit.Test;

public class HighCohesionTest {

    @Test
    public void add() {
        HighCohesion highCohesion = new HighCohesion();
        int sum = highCohesion.add(10, 20);

        Console.print(sum + "");
    }
}