package classdesign.ocp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerTest {

    @Test
    public void makeCoffee() {
        CoffeeMaker coffeeMaker = new CoffeeMaker(new BasicCoffee());
        assert !coffeeMaker.makeCoffee();

        coffeeMaker = new CoffeeMaker(new PremiumCoffee());
        assert coffeeMaker.makeCoffee();
    }
}