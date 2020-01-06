package principles.coupling;

public class LooseCoupling {

    private LooseHello hello;

    public LooseCoupling(LooseHello hello) {
        this.hello = hello;
    }

    public void say() {
        hello.display();
    }
}

class LooseHello {
    void display() {
        System.out.println("Hello");
    }
}
