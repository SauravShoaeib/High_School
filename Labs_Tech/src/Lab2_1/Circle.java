package Lab2_1;

/*
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 * @edits by Saurav Hossain, Dustin Sun, Daniel Li
 */

public class Circle implements Shape 
{
	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * @param radius
	 */
	
	public Circle(int radius) 
	{
		this.radius=radius;
	}

	@Override
	public double calculateArea() 
	{
		// to be implemented by student
		return (2 * pi * (Math.pow(radius, 2)));
	}

	@Override
	public double calculatePerimeter() 
	{
		// to be implemented by student
		return (2 * pi * radius);
	}

	@Override
	public String toString() 
	{
		// to be implemented by student
		return "Circle- \n" + "   Radius: " + radius + "   Area: " + this.calculateArea() + "   Circumference: " 
		+ this.calculatePerimeter();
	}
	
}