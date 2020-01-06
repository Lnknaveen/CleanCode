package principles.changeislocal;

public class GlobalChange {

    private int i;
    private int j;

    public GlobalChange(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int sum() {
        return i + j;
    }
}
