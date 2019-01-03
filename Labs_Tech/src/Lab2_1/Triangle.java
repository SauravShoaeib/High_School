package Lab2_1;

/*
 * @Created by Saurav Hossain, Dustin Sun, Daniel Li
 */

public class Triangle implements Shape
{
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) 
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double calculateArea() 
	{
		//Heron's Formula		
		double her = (calculatePerimeter()/2 * (((calculatePerimeter()/2) * side1) 
				* ((calculatePerimeter()/2) * side2 ) * ((calculatePerimeter()/2) * side3))); 
		double done = (Math.pow(her, 0.5));
		return done;
	}

	public double calculatePerimeter() 
	{
		// To be written by student
		return (side1 + side2 + side3);
	}

	public String toString() 
	{
		return "Triangle- \n" +  "   Side 1: " + side1 + "   Side 2: " + side2 + "   Side 3: " + side3 + "   Area(Heron's Forumala Given All Sides): " 
		+ this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
