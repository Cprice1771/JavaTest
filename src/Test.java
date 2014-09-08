import java.util.ArrayList;


public class Test {
	public static void main(String[] args)
	{
		MyNode A = new MyNode("A");
		MyNode B = new MyNode("B");
		MyNode C = new MyNode("C");
		MyNode D = new MyNode("D");
		MyNode E = new MyNode("E");
		MyNode F = new MyNode("F");
		MyNode G = new MyNode("G");
		MyNode H = new MyNode("H");
		MyNode I = new MyNode("I");
		MyNode J = new MyNode("J");
		
		
		A.AddChild(B);
		A.AddChild(C);
		A.AddChild(D);
		
		B.AddChild(E);
		B.AddChild(F);
		
		C.AddChild(G);
		C.AddChild(H);
		C.AddChild(I);
		
		D.AddChild(J);
		
		GnodeHelper help = new GnodeHelper();
		ArrayList<MyNode> allNodes = help.walkGraph(A);
		
		for(MyNode m : allNodes)
		{
			System.out.println(m.getName() + "");
		}
		
		ArrayList<ArrayList<MyNode>> allPaths = help.paths(A);
		
		for(ArrayList<MyNode> path : allPaths)
		{
			System.out.print("(");
			for(MyNode m : path)
			{
				System.out.print(m.getName() + "");
			}
			System.out.print(") ");
		}
	}
}
