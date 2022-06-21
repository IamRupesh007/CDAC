package study.Methodlocalinner;

public class Test3 {
	int alpha=888;
	public void m1()
	{
		final int x=100;
		int y =200;
		
		//Method Local Inner class
		class LocalEx{
			int z=99;
			public void show() {
				System.out.println("alpha="+alpha+" z="+z+" x="+x+" y="+y);
			}
		}//end of class
		
		LocalEx obj = new LocalEx();
		obj.show();
		
	}//end of m1 method
	public static void main(String[] args) {
		Test3 t3= new Test3();
		t3.m1();

	}

}
