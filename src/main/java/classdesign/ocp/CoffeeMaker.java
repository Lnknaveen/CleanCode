package classdesign.ocp;

public class CoffeeMaker {
    private CoffeeMachine coffeeMachine;

    public CoffeeMaker(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public boolean makeCoffee() {
        return coffeeMachine.makeCoffee();
    }
}

interface CoffeeMachine {
    boolean makeCoffee();
}

class BasicCoffee implements CoffeeMachine {
    @Override
    public boolean makeCoffee() {
        return false;
    }
}

class PremiumCoffee implements CoffeeMachine {
    @Override
    public boolean makeCoffee() {
        return true;
    }
}
