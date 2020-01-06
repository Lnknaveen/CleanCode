package coupling;

public class TightCoupling {
    private TightHello hello;

    public TightCoupling() {
        hello = new TightHello();
    }

    public void say() {
         hello.display();
    }
}

class TightHello {
    void display() {
        System.out.println("Hello");
    }
}


