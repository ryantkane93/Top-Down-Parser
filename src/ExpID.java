
public class ExpID extends Exp {

	String id;
	
	ExpID(String i)
	{
		id = i; 
	}
	
	@Override
	public void printParseTree(String indent)
	{
		super.printParseTree(indent);
		IO.displayln((indent+= " ") + indent.length() + " " + id);
	}
}
