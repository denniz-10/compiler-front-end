package lexer;

public class DoubleFloat extends Token{

    public final double value;

    public  DoubleFloat (double v) {
        super(Tag.DOUBLEFLOAT);
        value = v;
    }

    public String toString() {
        return "" + value;
    }
}

