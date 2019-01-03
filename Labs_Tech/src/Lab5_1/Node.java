package Lab5_1;

import java.util.ArrayList;

public class Node 
{
	public String name; //name of nodes
	ArrayList<Node> children; //connections

	//constructor
	public Node(String name, ArrayList<Node> children) 
	{
		this.name = name;
		this.children = children;
	}

	public ArrayList<Node> getChildren() 
	{
		return children;
	}

	public void setChildren(ArrayList<Node> children) 
	{
		this.children = children;
	}
	
	@Override
	public String toString() 
	{
		return "Current City: " + name; //+ " Links: " + getChildren().toString();
	}		
} 