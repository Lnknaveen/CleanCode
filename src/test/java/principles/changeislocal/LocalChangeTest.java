package principles.changeislocal;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocalChangeTest {

    @Test
    public void add() {
        LocalChange localChange = new LocalChange();
        localChange.sum(1, 2);
    }

}