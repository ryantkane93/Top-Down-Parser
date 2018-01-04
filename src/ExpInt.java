
public class ExpInt extends Exp{

	int i;
	
	ExpInt(String temp)
	{
		i  = Integer.parseInt(temp);
	}
	
	@Override
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		IO.displayln((indent+= " ") + indent.length() +" " + i);
	}
}
