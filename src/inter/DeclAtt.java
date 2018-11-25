package inter;
import symbols.*;

public class DeclAtt extends Stmt {
    public Id id;
    public Expr expr;

    public DeclAtt(Id i, Expr x) {
        id = i;
        expr = x;
        if( check(id.type, expr.type) == null) error("declAtt type error");
    }

    public Type check(Type p1, Type p2) {
        if(Type.numeric(p2) && Type.numeric(p2)) return p2;
        else if (p1 == Type.Bool && p2 == Type.Bool) return p2;
        else return null;
    }

    public void gen(int b, int a) {
        emit( id.type +" "+ id.toString() + " = " + expr.gen().toString());
    }

    public String toString() {
        return( id.type +" "+ id.toString() + " = " + expr.gen().toString()+";");
    }
}