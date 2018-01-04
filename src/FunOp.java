
public class FunOp {

	String op;
	
	FunOp(String s)
	{
		op = s;
	}
	public void printParseTree(String indent)
	{
		IO.displayln(indent+indent.length() + " " + op);
	}
}
