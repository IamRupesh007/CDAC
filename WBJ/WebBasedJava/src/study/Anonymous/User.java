package study.Anonymous;

public class User {

	public static void main(String[] args) {
		
	I1 obj = new I1() {//anonymous class implements I1
		
		@Override
		public void doTask3(int x) {
			System.out.println(x);
			
		}
		
		@Override
		public String doTask2() {
			// TODO Auto-generated method stub
			return "hi";
		}
		
		@Override
		public void doTask1() {
			// TODO Auto-generated method stub
			System.out.println("int task1");
		}
	};
	
	obj.doTask1();
	System.out.println(obj.doTask2());
	obj.doTask3(45);
	}//end of main

}//end of user class

interface I1
{
	void doTask1();
	String doTask2();
	void doTask3(int x);
	
}
