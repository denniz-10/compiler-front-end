package lexer;

public class Double extends Token{

    public final double value;

    public Double(double v) {
        super(Tag.DOUBLE);
        value = v;
    }

    public String toString() {
        return "" + value;
    }
}

