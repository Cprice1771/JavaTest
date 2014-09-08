
public class MyNode implements GNode {

	private String myName;
	private MyNode[] myChildren;
	
	public MyNode(String name)
	{
		myName = name;
		myChildren = new MyNode[0];
	}
	@Override
	public String getName() {
		return myName;
	}

	@Override
	public MyNode[] getChildren() {
		return myChildren;
	}
	
	public void AddChild(MyNode child)
	{
		MyNode[] temp = myChildren;
		myChildren = new MyNode[temp.length + 1];
		for(int i = 0; i < temp.length; i++)
		{
			myChildren[i] = temp[i];
		}
		myChildren[temp.length] = child;
	}

}
