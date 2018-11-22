package symbols;
import lexer.*;
public class Type extends Word{
	public int width = 0;
	public Type(String s, int tag, int w) { super(s, tag); width = w;}
	public static final Type
		Int = new Type("int", Tag.BASIC, 4 ),
		Float = new Type("float", Tag.BASIC, 8),
		Char = new Type("char", Tag.BASIC, 1),
		Bool = new Type("bool" , Tag.BASIC, 1),
    //definição do tipo double, onde é declarada a forma como deve ser escrita por meio do 1 parametro, que é uma string
    //definir a que tipo de etiqueta ele pertence(BASIC), possivelmente o w é quantas casas decimais ele aceita ou quantos bytes
		Double = new Type("double", Tag.BASIC, 9);


	public static boolean numeric(Type p) {
	    //Reconhecer que o double é um tipo numerico
		if (p == Type.Char || p == Type.Int || p == Type.Float || p == Type.Double) return true;
		else return false;
	}
	public static Type max(Type p1, Type p2 ) {
		if ( ! numeric(p1) || ! numeric(p2) ) return null;
		else if (p1 == Type.Float || p2 == Type.Float ) return Type.Float;
		else if (p1 == Type.Double || p2 == Type.Double) return Type.Double;
		else if ( p1 == Type.Int || p2 == Type.Int ) return Type.Int;
		else return Type.Char;
	}
}