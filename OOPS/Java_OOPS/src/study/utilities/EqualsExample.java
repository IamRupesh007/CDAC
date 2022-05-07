package study.utilities;

public class EqualsExample {
public static void main(String[] args) {
	Dummy2 obj1 = new Dummy2(12, "RK");
	//Dummy2 obj2 = obj1;
	Dummy2 obj2 = new Dummy2 (12, "RK"); //Address different
	
	System.out.println("Equals result = "+obj1.equals(obj2));
	
	System.out.println("Hashcode of OBj 1 = " +obj1.hashCode());
	System.out.println("Hashcode of OBj 2 = " +obj2.hashCode());
 }
}//end of main class

class Dummy2
{
	private int rollnumber;
	private String name;
	
	public Dummy2(int x, String n)
	{
		rollnumber =x;
		name =n;
	}
	
	@Override
	public boolean equals(Object obj) {
		Dummy2 temp = (Dummy2)obj;
		if(temp.rollnumber==this.rollnumber && temp.name.equals(this.name))
		return true;
		else
		return false;
		
	}
	/*@Override
	public int hashCode() {
		
		return rollnumber;
	}*/
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}