package study.practice;

/*Write a program that creates a HashMap of RollNumbers and name.
Accept 5 rollNumber and names pairs from user and add to hashmap Use iterator.
show all names in the hashmap[Use loop without index].*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem5 {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		Scanner sc = new Scanner( System.in);
		for(int i =0;i<5;i++)
		{
			System.out.println("Enter roll number and name");
			int num = sc.nextInt();// 10 20 
			String name = sc.next();// onkar
			h1.put(num, name);	
		}
//		h1.put(1, "Onkar Kalaskar");
//		h1.put(2, "Sneha Kalaskar");
//		h1.put(3, "Prathmesh nehulkar");
//		h1.put(4, "Jayesh");
//		h1.put(5, "Amey");
		
		System.out.println("All Students: ");
		Set<Integer> list = h1.keySet();// 10 20 30 40 50 
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			int key = it.next();
			String name = h1.get(key);// 10 onkar
			System.out.println("Roll number: "+ key+" Name: "+ name);
		}
		sc.close();
	}
}

