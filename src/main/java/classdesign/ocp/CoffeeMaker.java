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
