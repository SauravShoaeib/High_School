package Lab2_1;

/*
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 * @edits by Saurav Hossain, Dustin Sun, Daniel Li
 */

public class Square extends Rectangle
{
	private int side;

	public Square(int side) 
	{
		super(side, side);
		this.side = side;
	}
	
	public double calculateareaperi() 
	{
		return(Math.pow(side, 2));
	}

	public double calculateArea() 
	{
		// To be written by student
		return (Math.pow(side, 2));
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (side * 4);
	}
	
	@Override
	public String toString() 
	{
		// To be written by student
		return  "Square- \n" + "   Side Length: " + side + "   Area: " + calculateArea() + "   Perimeter: " + calculatePerimeter();
	}
}