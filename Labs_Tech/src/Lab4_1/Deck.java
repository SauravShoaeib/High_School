package Lab4_1;

import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	private ArrayList <Card> unDealt;
	private ArrayList <Card> Dealt;
	
	public Deck(String[] ranks, String[] suits, int[] pointValues) 
	{
		this.Dealt = new ArrayList<Card>();
		this.unDealt = new ArrayList<Card>();
	
		for(int i = 0; i < suits.length; i++) 
		{
			for(int k = 0; k < ranks.length; k++) 
			{
				unDealt.add(new Card(suits[i], ranks[k], pointValues[k]));
			}
		}
	}

	public boolean isEmpty()
	{
		if(unDealt.size() == 0) 
		{
			return true;
		}
		return false;
	}

	int size() 
	{
		return unDealt.size();
	}
	
	public Card deal() 
	{
		if(unDealt.size() != 0)
		{
			Card p = unDealt.get(0);
			Dealt.add(p);
			return unDealt.remove(0);
		}
		else return null;
	}

	public void shuffler()
	{
		  Random x = new Random();
		 
		  for(int i = Dealt.size()-1; i >= 0; i--)
		   {
		      unDealt.add(Dealt.remove(i));   
		   }
		 
		  for (int k = 51; k > 0; k--)
		  {
			int op = x.nextInt(k);
			Card ib = unDealt.get(op);
			Card temp = unDealt.get(k);
			unDealt.set(op, temp);
			temp = unDealt.set(k, ib); 
		  }
	}
	
	@Override
	public String toString() 
	{
		return "Undealt Deck: " + unDealt + "\n Dealt Deck: " + Dealt;
	}
}