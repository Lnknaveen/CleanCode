package principles.coupling;

import org.junit.Test;

public class LooseCouplingTest {
    @Test
    public void say() {
        LooseHello hello = new LooseHello();

        LooseCoupling looseCoupling = new LooseCoupling(hello);
        looseCoupling.say();
    }
}