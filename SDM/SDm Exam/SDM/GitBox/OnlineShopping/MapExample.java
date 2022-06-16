package study.collections;
//changes made by Ranjeet
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
public static void main(String[] args) {
//This change done by by Rahul
	//TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
	//tree map will give  
	
	//HashMap<Integer, String> hm=new HashMap<Integer, String>();
	//Hashmap gives bucket order
	
	LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
	//Linked Gives as per put order
	
	hm.put(16, "RK"); //(key-12, value-RK)
	hm.put(22, "Rupesh");
	hm.put(13, "Ram");
	hm.put(12, "RepeatOverride");
	hm.put(15, "Sam");
	
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter a roll number");
	
	//System.out.println("The name is "+hm.get(sc.nextInt()));
	
	Set<Integer> set = hm.keySet();
	Iterator<Integer> iter = set.iterator();
	while(iter.hasNext()) {
	int key = iter.next();
	String value = hm.get(key);
		
		System.out.println(key+ " "+value);
	}
 }
}
