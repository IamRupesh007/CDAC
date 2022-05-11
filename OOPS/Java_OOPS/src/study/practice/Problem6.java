package study.practice;

import java.util.Scanner;

/*Create Shape class which have area() method which is abstract .Create classes 
Square ,Triangle,Rectanglec which are inherited from Shape class.
overried Area() method in all classes and call them using Base class reference.*/
public class Problem6 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Area of circle");
		System.out.println("enter the value of radius:");
		
		double b=sc.nextDouble();
		area(new Circle(b));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Area of Triangle");
		System.out.println("enter the value of height and base");
		
		double h1=sc.nextDouble();
		double b1=sc.nextDouble();
		
		area(new Triangle(h1,b1));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Area of Rectangle:");
		System.out.println("enter the value of length and breadth");
		
		double l2=sc.nextDouble();
		double b2=sc.nextDouble();
		
		area(new Rectangle(l2,b2));
		sc.close();
     
	}
    private static void area(Shape shape)
    {
    	double area=shape.area();
    	System.out.println("Area: "+area);
    }

}

