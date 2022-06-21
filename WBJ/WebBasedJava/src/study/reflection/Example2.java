package study.reflection;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Class Name ");
		Class c1= Class.forName(sc.next());
		
		System.out.println("The class is "+c1.getName());
		Object obj =  c1.newInstance();
		
		Field[] properties = c1.getDeclaredFields();
		
		for(Field property : properties)
		{
			property.setAccessible(true);
			System.out.println(property.getName() +" : "+ property.get(obj));
		}
		
	}

}//end of Example2

class SocialEvent
{
	 private String eventName;
	 private int numberofPeople;
	
	public SocialEvent()
	{
		eventName="Birthday Party";
		numberofPeople=10;
	}
	
	public SocialEvent(String en, int num)
	{
		eventName=en;
		numberofPeople =num;
	}
	public void show()
	{
		System.out.println(eventName+" "+numberofPeople);
	}
	
	public int getnumberofPeople()
	{
		return numberofPeople;
	}
	
}
