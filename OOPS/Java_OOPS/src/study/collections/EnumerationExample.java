package study.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {
		Vector<String> v= new Vector <String>();
		v.add("Green");
		v.add("Red");
		v.add("Blue");
		//*******************************************
		System.out.println("Printing with enumerator: ");
		Enumeration<String> enumer = v.elements();
		while(enumer.hasMoreElements())
			System.out.println(enumer.nextElement());
		///******************************************
		System.out.println("Printing with iterator: ");
				
		Iterator<String> iter = v.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	
	}
}	
