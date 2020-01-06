package classdesign.ocp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerTest {

    @Test
    public void makeCoffee() {
        CoffeeMaker coffeeMaker = new CoffeeMaker(new CoffeeMachine() {
            @Override
            public boolean makeCoffee() {
                return false;
            }
        });

        assert !coffeeMaker.makeCoffee();

        coffeeMaker = new CoffeeMaker(new CoffeeMachine() {
            @Override
            public boolean makeCoffee() {
                return true;
            }
        });

        assert coffeeMaker.makeCoffee();
    }
}