
public class MultipleFunDef extends FunDefList {
	
	SingleFunDef funDef;
	FunDefList list;
	
	MultipleFunDef(SingleFunDef fd, FunDefList l)
	{
		funDef=fd;
		list = l;
	}
	
	public void printParseTree(String indent)
	{
		funDef.printParseTree(indent);
		list.printParseTree(indent);
}

}
