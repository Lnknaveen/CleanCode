package coupling;

import org.junit.Test;

import static org.junit.Assert.*;

public class LooseCouplingTest {
    @Test
    public void say() {
        LooseHello hello = new LooseHello();

        LooseCoupling looseCoupling = new LooseCoupling(hello);
        looseCoupling.say();
    }
}