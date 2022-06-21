package study.usinginner;

public class Test {
private int data1=100;
	
	class User //inner class
	{
		private int data2=101;
		private int common=200;// this is the property test

		public void display() {
		//outer class Explicitly creates object of user
			System.out.println("");
		}
		
		public void show() {
			//inner class method is directly using the private property of outer class
			System.out.println("Using inner Class \n data2= "+data2+" data1= " + data1);
		}
	}//end of user 

	public static void main(String[] args) {
		Test obj = new Test();
		User u = obj.new User();
		u.show();
 
	}

}//end of test
