
public class ExpConditional extends Exp {
	
	Exp expr1;
	Exp expr2;
	Exp expr3;

	ExpConditional(Exp e1, Exp e2, Exp e3)
	{
		expr1 = e1;
		expr2 = e2;
		expr3= e3;
	}
	
	@Override
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		String condSpacing = indent+=" ";
		IO.displayln((condSpacing)+ indent.length() + " " + " if "); 
		expr1.printParseTree(indent+" "); 
		IO.displayln((condSpacing)+indent.length() + " "+ " then "); 
		expr2.printParseTree(indent + " ");
		IO.displayln((condSpacing)+indent.length() + " " + " else ");
		expr3.printParseTree(indent+ " ");
	}
}
