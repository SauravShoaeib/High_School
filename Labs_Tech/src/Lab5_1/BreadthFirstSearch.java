package Lab5_1;

import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends AbstractSearch
{
	Node sn, gn; //start and end
	
	//cons
	public BreadthFirstSearch(Node start, Node goal) 
	{
		this.sn = start;
		this.gn = goal;
	}
	
	public boolean search() 
	{
		if(this.sn.equals(gn)) 
		{
			System.out.println("Found");
			System.out.println(sn);
		}
		
		Queue<Node> queue = new LinkedList<>(); //next ups
		ArrayList<Node> explored = new ArrayList<>(); //donezo
		queue.add(this.sn);
		explored.add(sn);
		
		while(!queue.isEmpty()) 
		{
			Node c = queue.remove();
			if(c.equals(this.gn)) 
			{
				System.out.println(explored);
				return true;
			}
			else 
			{
				if(c.getChildren().isEmpty()) 
				{
					return false;
				}
				else 
				{
					queue.addAll(c.getChildren());
				}
			}
			explored.add(c);
		}
		return false;
	}
}