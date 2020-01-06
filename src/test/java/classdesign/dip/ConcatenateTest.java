package classdesign.dip;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateTest {

    @Test
    public void concatenate() {
        List<Value> valueList = new ArrayList<>();
        valueList.add(new StringValue());
        valueList.add(new IntValue());

        Concatenate concatenate = new Concatenate(valueList);
        System.out.println(concatenate.execute());
    }
}