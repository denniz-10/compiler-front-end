package inter;

import lexer.Tag;
import lexer.Token;

public class Counter extends Token {

    public final int value;

    public Counter(int v) {
        super(Tag.COUNTER);
        value = v + 1;
    }

    public String toString() {
        return "" + value;
    }
}

