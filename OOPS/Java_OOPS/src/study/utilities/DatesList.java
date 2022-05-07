package study.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DatesList {
	public static void main(String[] args) {
		
		ArrayList<MyDate> a1= new ArrayList<MyDate>();
	
		a1.add(new MyDate(1,1,2022));
		a1.add(new MyDate(15,8,1947));
		a1.add(new MyDate(14,3,2020));
		a1.add(new MyDate(9,1,2025));
		a1.add(new MyDate(8,1,1922));
		a1.add(new MyDate(1,1,2022));
		
		Collections.sort(a1);
	
		show(a1);
	}//end of main class
	
	public static void show(List<MyDate> list)
	{
		Iterator<MyDate> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());//every next gives a Mydate Object, its toString is printed
	}
}
