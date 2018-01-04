
public class MultipleParameter extends Parameters {
	
	SingleParameter param;
	Parameters multipleParam;
	
	MultipleParameter(SingleParameter sp, Parameters mp)
	{
		multipleParam = mp;
		param =sp;
	}
	public void printParseTree(String indent)
	{
		param.printParseTree(indent);
		multipleParam.printParseTree(indent);
	}

}
