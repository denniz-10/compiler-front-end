package inter;
import symbols.*;

//alteracao
public class For extends Stmt{
    Stmt init;
    Expr expr;
    Stmt increment;
    Stmt stmt;

    public For() {
        expr = null;
        stmt = null;
    }

    public void init (Stmt init, Expr x, Stmt increment, Stmt s) {
        this.init = init;
        this.expr = x;
        this.increment = increment;
        this.stmt = s;
        if(expr.type != Type.Bool) expr.error("boolean required in white");
    }

    public void gen(int b , int a) {
        emit("for("+init.toString()+" "+expr.toString()+"; "+increment.toString()+")");
        after = a;
        expr.jumping(0, a);
        int label = newlabel();
        emitlabel(label);
        stmt.gen(label, b);
        emit("goto L" + b);
    }
}