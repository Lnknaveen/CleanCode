package principles.coupling;

import org.junit.Test;

public class TightCouplingTest {

    @Test
    public void say() {
        TightCoupling tightCoupling = new TightCoupling();
        tightCoupling.say();
    }
}