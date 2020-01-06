package classdesign.lcp;


public interface Logger {
    void info();
    void debug();
}

class ConsoleLogger implements  Logger {
    @Override
    public void info() {
        System.out.println("Info");
    }

    @Override
    public void debug() {
        System.out.println("Debug");
    }
}

class VoidLogger implements Logger {

    @Override
    public void info() {

    }

    @Override
    public void debug() {

    }
}
