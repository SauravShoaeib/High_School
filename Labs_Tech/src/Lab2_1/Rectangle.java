package Lab2_1;

/*
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 * @edits by Saurav Hossain, Dustin Sun, Daniel Li
 */

public class Rectangle extends Parallelogram 
{
	private int length;
	private int width;

	public Rectangle(int length, int width) 
	{
		super(width,length,width);
		this.length = length;
		this.width = width;
	}

	public double calculateArea() 
	{
		// To be written by student
		return (length * width);
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return ((2 * length) + (2 * width));
	}

	public String toString() 
	{
		return "Rectangle- \n"  + "   Width: " + width + "   Length: " + length + "   Area: " + this.calculateArea() 
		+ "   Perimeter: " + this.calculatePerimeter();
	}
}