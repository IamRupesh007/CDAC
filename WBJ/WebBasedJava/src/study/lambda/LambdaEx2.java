package study.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaEx2 {
	public static void main(String[] args) {
		Comparator<Student> cmp = (o1,o2)->{
			if(o1.roll > o2.roll) return 1;
			if(o1.roll < o2.roll) return -1;
			else 
				return 0;
		};
		
		TreeSet<Student> ts = new TreeSet<Student>(cmp);
		ts.add(new Student(13,"XXX"));
		ts.add(new Student(14,"ABCD"));
		ts.add(new Student(15,"PQR"));
		ts.add(new Student(9,"LMNO"));
		ts.add(new Student(20,"yyy"));
		
		for(Student stud: ts)
			System.out.println(stud);
	}

}//end of LambdaEx2

class Student implements Comparable<Student>
{
	int roll;
	String name;

Student(int r, String s)
{
	roll=r;
	name=s;
}
	@Override
	public String toString() {
	
	return roll+" "+name;
	}
	@Override
	public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.name.compareTo(o.name);
}

}
