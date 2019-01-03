package Lab2_1;

/*
 * @Created by Saurav Hossain, Dustin Sun, Daniel Li
 */

public class Pentagon implements Shape
{
	private int side;
	
	public Pentagon(int side) 
	{
		this.side = side;
	}
	
	public double calculateArea() 
	{
		return (0.25 * (Math.pow((5 * (5 + (2 * (Math.pow(5, 0.5))))),0.5)) * (Math.pow(side, 2)));
	}
	
	public double calculatePerimeter()
	{
		return (5 * side);
	}
	
	public String toString() 
	{
		return "Pentagon- \n"  + "   Side: " + side + "  Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
}