package Lab4_1;

public class DeckTester 
{
	public static void main(String[] args) 
	{
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] pointValues = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		Deck z = new Deck(ranks, suits, pointValues);
		
		z.shuffler();

		for(int i = 0; i < 52; i++) 
		{
			z.deal();
		}
		System.out.print(z);
	}
}