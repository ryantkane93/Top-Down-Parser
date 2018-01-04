
public class ExpFloatE extends Exp{

	float floatE;
	
	ExpFloatE(String f)
	{
		floatE=Float.parseFloat(f);
	}
	

	@Override
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		IO.displayln((indent+= " ") + indent.length() +" " + floatE);
	}
}
