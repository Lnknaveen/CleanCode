package principles.easyremove;

import org.junit.Test;

import static org.junit.Assert.*;

public class EasyToRemoveTest {

    @Test
    public void findResult() {
        EasyToRemove easyToRemove = new EasyToRemove();
        assertEquals(1, easyToRemove.findResult(5, 11));
        assertEquals(1, easyToRemove.findResult(25, 5));
        assertEquals(4, easyToRemove.findResult(10, 22));
    }
}