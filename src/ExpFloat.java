
public class ExpFloat extends Exp{
	
	float f;
	
	ExpFloat(String temp)
	{
		f = Float.parseFloat(temp);
	}
	
	@Override
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		IO.displayln((indent+= " ") + indent.length() +" " + f);
	}

}
