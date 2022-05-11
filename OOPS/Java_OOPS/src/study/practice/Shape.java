package study.practice;

public abstract class Shape 
{
	abstract double area();

}//end of shape class

class Circle extends Shape
{
	double radius;

	public Circle(double radius)
	{

		this.radius = radius;
	}

	private double areaofcircle()
	{
		final double  pi=3.14;
		double area=pi*radius*radius;
		return area;
	}

	@Override
	double area() {

		return areaofcircle();
	}
}//end of shape class
//-------------------------------------------------------------------------------------
class Triangle extends Shape
{
	double base,height;

	public Triangle(double base, double height)
	{

		this.base = base;
		this.height = height;
	}

	double areaoftriangle()
	{
		double area=base*height*0.5;
		return area;
	}
	@Override
	double area()
	{

		return areaoftriangle();
	}

}//end of Triangle class
//--------------------------------------------------------------------------------------
class Rectangle extends Shape
{

	double length,breadth;

	public Rectangle(double length, double breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}

	double areaofrectangle()
	{
		double area=length*breadth;
		return area;
	}
	@Override
	double area() {

		return areaofrectangle();
	}

}//end of Rectangle class
