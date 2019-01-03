package Project_1;

/*
 * Created by Saurav Hossain and Dustin Sun
 * Please make sure to enter valid inputs
 * Although all methods can be run at once, it is recommended to run each at a time for viewers pleasure C:
 * In order to run only one method at a time comment it off using //
*/

public class Runner 
{
	public static void main(String [] args) 
	{		
		//Must enter a positive integer value 
		SHossainLib.factorializer(3);
		//Must enter a date in mm/dd/yyyy format with 0 as fillers when needed
		SHossainLib.dateStr("01/15/2000");
		//Must enter two integer values  
		SHossainLib.multiplicationTable(3,20);
		//Must enter integer values for m and b, and a double value for x
		SHossainLib.linearSolver(3,10,5);
		//Must enter an integer value 
		DSunLib.sumUpTo(6);
		//Must enter a string in "word" format
		DSunLib.isPalindrome("tacocat");
		//Must enter a double value
		DSunLib.areeandCircumofCircle(4);		
	}
}