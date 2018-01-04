
public class MultipleExp extends ExpList {
	
	Exp e;
	ExpList list;
	
	MultipleExp (Exp ex, ExpList l)
	{
		e = ex;
		list = l;
	}
	
	public void printParseTree(String indent)
	{
		e.printParseTree(indent);
		if(list!=null)
		{
		list.printParseTree(indent);
		}
	}

}
