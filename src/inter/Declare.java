package inter;

//alteracao
public class Declare extends Stmt {
    public Id id;

    public Declare(Id i) {
        id = i;
    }

    public void gen(int b, int a) {
        emit( "decl: "+ id.type +" "+ id.toString());
    }
}