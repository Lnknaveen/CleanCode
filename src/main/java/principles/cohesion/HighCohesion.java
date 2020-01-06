package principles.cohesion;

public class HighCohesion {
    public int add(int i, int j) {
        return i + j;
    }
}

class Console {
    public static void print(String msg) {
        System.out.println(msg);
    }
}