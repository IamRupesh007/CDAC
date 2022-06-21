package study.lambda;

import java.util.ArrayList;

public class StreamsEx {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("red");
		al.add("blue");
		al.add("violet");
		al.add("pink");
		
		al.stream().forEach( (element)->{ System.out.println("this is "+element);});
		
		al.stream().forEach( (e)->{ System.out.println(e.toUpperCase());});
	
		System.out.println("After Filtering: ");
		al.stream()
		.filter( (ele)->{if(ele.length()<5) return true; else return false;} )
		.forEach( (e)->{System.out.println(e);});
	}//end of main

}//end of class StreamEx
