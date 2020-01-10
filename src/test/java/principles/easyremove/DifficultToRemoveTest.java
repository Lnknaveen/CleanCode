package principles.easyremove;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifficultToRemoveTest {

    @Test
    public void findResult() {
        DifficultToRemove difficultToRemove = new DifficultToRemove();
        assertEquals(1, difficultToRemove.findResult(5, 11));
        assertEquals(1, difficultToRemove.findResult(25, 5));
        assertEquals(4, difficultToRemove.findResult(10, 22));
    }
}