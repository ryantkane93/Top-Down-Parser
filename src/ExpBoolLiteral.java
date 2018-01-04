
public class ExpBoolLiteral extends Exp {
	
	String bool;
	
	ExpBoolLiteral(String result)
	{
		bool = result;
	}
	

	@Override
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		IO.displayln((indent+= " ") + indent.length() +" " + bool);
	}

}
