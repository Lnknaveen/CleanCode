package principles.changeislocal;

import org.junit.Test;

import static org.junit.Assert.*;

public class GlobalChangeTest {

    @Test
    public void sum() {
        GlobalChange globalChange = new GlobalChange(1, 3);
        globalChange.sum();
    }
}