package Lab2_1;

/*
 * @Created by Saurav Hossain, Dustin Sun, Daniel Li
 */

//why does theta always come out 0 #broken

public class Parallelogram implements Shape
{
	private int sidea;
	private int sideb;
	private int angle;

	public Parallelogram(int sidea, int sideb, int angle) 
	{
		this.sidea = sidea;
		this.sideb = sideb;
		this.angle = angle;
	}
	
	public double calculateArea() 
	{
		// To be written by student
		return (sidea * sideb * (Math.sin(angle)));
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (2 * (sidea + sideb));
	}

	public String toString() 
	{
		return "Parallelogram- \n"  + "   Side A: " + sidea + "   Side B: " + sideb + "   Angle: " + angle + 
				 "   Area: " + this.calculateArea() + "   Perimeter: " + this.calculatePerimeter();
	}
}