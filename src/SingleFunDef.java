
public class SingleFunDef extends FunDefList {

	Header head;
	Exp expression;
	
	SingleFunDef(Header h, Exp e)
	{
		head=h;
		expression=e;
	}
	

	public void printParseTree(String indent)
	{			

		if(head != null && expression != null)
		{
		IO.displayln(indent + indent.length() + " <fun def>" );
		head.printParseTree(indent+" ");
		expression.printParseTree(indent+" ");
		}
	}
}
