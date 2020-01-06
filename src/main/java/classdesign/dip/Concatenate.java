package classdesign.dip;

import java.util.List;

public class Concatenate {
    List<Value> ops;

    public Concatenate(List<Value> ops) {
        this.ops = ops;
    }

    public String execute() {
        StringBuilder result = new StringBuilder();

        for (Value op : ops) {
            result.append(op.getValue());
            result.append(" ");
        }

        return result.toString();
    }
}

interface Value {
    String getValue();
}

class IntValue implements Value {
    @Override
    public String getValue() {
        return Integer.toString(1);
    }
}

class StringValue implements Value {
    @Override
    public String getValue() {
        return "STR";
    }
}
