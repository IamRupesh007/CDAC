package study.practice;

import java.util.ArrayList;

/*Write a program that accepts numbers from command line 
show the following
1.Sum of all numbers.
2.all numbers in sorted order.
3.Maximum number from all numbers .
4.Minimum value from all numbers.
Handle non-number input exception using exception handling code. and skip it.*/
public class Problem3 {
	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		try {
		for (int i = 0; i < arr.length; i++) {
			
			arr.add(Integer.parseInt(args[i]));
			
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("Run ok");
	}
}
