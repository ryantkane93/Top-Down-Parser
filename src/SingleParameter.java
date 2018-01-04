
public class SingleParameter extends Parameters {

	Type t; 
	String id;
	
	SingleParameter(Type type, String i)
	{
		id = i;
		t = type;
	}
	
	public void printParseTree(String indent)
	{
		IO.displayln(indent + indent.length() + " <parameter> " + t.getType() + " " + id);
	}
}
