package Project_1;
/*
 * Name: Dustin Sun
 * Teacher: Levin 
 * Method Madness- Project 1
 * Period: 2
*/

public class DSunLib 
{
	//sumUpTo adds all numbers up to given value- done
	public static void sumUpTo(int x) 
	{
		int y = 0;
		for (int i = 1; i <= x; i++) 
		{
			y = y + i;
		}
		System.out.println(y);
	}

	//isPalindrome checks if string same backwards and forwards
	public static void isPalindrome(String str)
	{
		String g = "";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			g += str.charAt(i);
		}
		System.out.println(str.equals(g));
	}

	//areaandCircumofCircle- finds the area and circumference of a circle given a radius of any positive value.
	public static void areeandCircumofCircle(double r) 
	{	
		double area = Math.PI*(r * r);
		double circum = Math.PI*(2 * r);
		System.out.println("Area = " + area);
		System.out.println("Circumference = " + circum);
	}
}