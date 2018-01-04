

public class ParameterList {

	Parameters param;

	ParameterList(Parameters p)
	{
		param = p;
	}
	
	public void printParseTree(String indent)
	{
		IO.displayln(indent + indent.length()+  " <parameter list> " );
		param.printParseTree(indent+ " ");
	}
}
