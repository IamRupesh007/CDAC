package study.utilities;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		Collection<Integer> ints = Arrays.asList(45,30,12,1,99,78,65,78,2,21);
		ts.addAll(ints);
		for(Integer i : ts)
			System.out.println(i);
	}
}
