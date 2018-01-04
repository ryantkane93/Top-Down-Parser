
public class FunName {

	String id;
	
	FunName (String i)
	{
		id = i;
	}
	
	public void printParseTree(String indent) 
	{
		IO.displayln(indent+indent.length() + " <fun name> " + id);
	}
}
