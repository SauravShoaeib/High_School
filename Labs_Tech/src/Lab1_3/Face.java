package Lab1_3;
/*
 * Name: Saurav Hossain 
 * ID: 205030307
 * Class: Java 
 * Teacher: Mr. Levin Pd:2
*/

//Prints a face in the console 

public class Face 
{
	public static void main(String[] args) 
	{
		int [][] x = new int [10][21];
		x[1][17] = 3;
		x[1][5] = 3;
		x[3][11] = 4;
		x[5][11] = 1;x[5][10] = 1;x[5][12] = 1;x[5][9] = 1;x[5][13] = 1;
		x[6][8] = 1;x[6][14] = 1;
		x[6][7] = 1;x[6][15] = 1;
		x[6][6] = 1;x[6][16] = 1;
		
		facePrinter(x);
	}
	
	public static void facePrinter(int [][] x) 
	{
		for(int i = 0; i < x.length; i++ )
		{
			for(int j = 0; j < x[i].length; j++)
			{
				if(x[i][j] == 0)
				{
					System.out.print(" ");
				}
			
				else System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}