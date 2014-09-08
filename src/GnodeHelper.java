import java.util.ArrayList;

public class GnodeHelper {
	public ArrayList<MyNode> walkGraph(MyNode node)
	{
		ArrayList<MyNode> nodes = new ArrayList<MyNode>();
		nodes.add(node);
		nodes = getAllNodes(node, nodes);
		return nodes;
	}
	
	private ArrayList<MyNode> getAllNodes(MyNode node, ArrayList<MyNode> nodes)
	{
		for(MyNode g : node.getChildren())
		{
			if(!nodes.contains(g))
				nodes.add(g);
			
			getAllNodes(g, nodes);
		}
		
		return nodes;
		
	}
	
	
	
	
	public ArrayList<ArrayList<MyNode>> paths(MyNode node)
	{
		ArrayList<ArrayList<MyNode>> nodes = getAllPaths(node);
		
		return nodes;
		
	}
	
	
	private ArrayList<ArrayList<MyNode>> getAllPaths(MyNode node)
	{
		ArrayList<ArrayList<MyNode>> paths = new ArrayList<ArrayList<MyNode>>();
		ArrayList<MyNode> path = new ArrayList<MyNode>();
		path.add(node);
		paths.add(path);
		paths = getPaths(paths);
		
		
		return paths;
		
	}
	
	private ArrayList<ArrayList<MyNode>> getPaths(ArrayList<ArrayList<MyNode>> nodes)
	{
		
		boolean done = true;
		ArrayList<ArrayList<MyNode>> tempPaths = new ArrayList<ArrayList<MyNode>>();
		for(ArrayList<MyNode> nodeList : nodes)
		{
		   
			for(MyNode node : nodeList.get(nodeList.size() - 1).getChildren())
			{
				ArrayList<MyNode> tempList = (ArrayList<MyNode>)nodeList.clone();
				tempList.add(node);
				tempPaths.add(tempList);
				done = false;
			}
		}	
			
		if(done)
			return nodes;
		else
			return getPaths(tempPaths);
		
	
	}
	
	
	
}