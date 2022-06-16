package study.isa;

import study.has.MyDate;

public class PartTimeEmployee extends Employee {
	
	int numberofhours;

	public int getNumberofhours() {
		return numberofhours;
	}

	public void setNumberofhours(int numberofhours) {
		this.numberofhours = numberofhours;
	}

	public PartTimeEmployee(int numberofhours, int empId, double salary, String department, String n, MyDate dob) 
	{
		super(empId, salary,department, n, dob);
		this.numberofhours = numberofhours;
	}

	@Override
	public String toString() {
		
		String str = this.numberofhours+","+super.toString();
		return str;
		
		
	}
	
		

}
