
public class FunExp extends Exp{

	FunOp operation;
	ExpList list;
	
	FunExp(FunOp fo, ExpList e)
	{
		operation = fo;
		list = e;
	}
	
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		Parser.displayln((indent+=" ") + indent.length() + " <fun exp> ");
		operation.printParseTree(indent + " ");
		if(list != null)
		{
			list.printParseTree(indent + " ");
		}
	}
}
