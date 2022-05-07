package LabExample;

public class Main {
 public static void main(String[] args) {
	String S1="This is a demo class";
	
	Char ch[]=new char[S1.length()];
	for(int i=0;i<S1.length(); i++)
	{
		ch[i]=S1.charAt(i); 
	}
	System.out.println(ch);
}
}
