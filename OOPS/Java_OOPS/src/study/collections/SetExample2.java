package study.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample2 {
	public static void main(String[] args) {
		TreeSet<Dummy> ts = new TreeSet<Dummy>();
		ts.add(new Dummy(1,"AA"));
		ts.add(new Dummy(19,"BB"));
		ts.add(new Dummy(21,"CCA"));
		ts.add(new Dummy(5,"KKA"));
		
		for(Dummy d: ts)
			System.out.println(d);
	}


public class Dummy(int i; String s)
{
	
}

class IDOrdering 
}//end of class