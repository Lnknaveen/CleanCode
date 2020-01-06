package coupling;

import org.junit.Test;

import static org.junit.Assert.*;

public class TightCouplingTest {

    @Test
    public void say() {
        TightCoupling tightCoupling = new TightCoupling();
        tightCoupling.say();
    }
}