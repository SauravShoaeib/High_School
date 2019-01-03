package Project_1;

/*
 * Name: Saurav Hossain
 * Teacher: Levin 
 * Method Madness- Project 1
 * Period: 2 
*/

public class SHossainLib 
{
	//dateStr date put in mm/dd/yyyy comes out dd-mm-yyyy
 	public static void dateStr(String str) 
	{
 		String Day = str.substring(3,5);
 		String Month = str.substring(0,2);
 		String Year = str.substring(6);
 		String formatted = Day + "-" + Month + "-" + Year;
 			{
 				System.out.println(formatted);
 			}	
	} 

	//multiplicationTable given base and range does base*n for all n integers from 0
	public static void multiplicationTable(int base, int range) 
	{
		for (int i = 1; i <= range; i++) 
		{
			int prod = base * i;
			String printthis = ( "" + base + " * " + "" + i + " = " + prod);
			System.out.println(printthis);
		}
		
	}
		
	//factorializer does factorials up to given value
	public static void factorializer(int x) 
	{
		int y=1;
		for (int i = 1; i <= x; i++) 
		{
			y = y * i;
		}
		System.out.println(y);
	}
		
	//linear Solver y=mx+b
	public static void linearSolver(int m, double x, int b) 
	{
		Double y = (m * x) + b;
		System.out.println(y);
	}
}