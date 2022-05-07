package study.generic;

public class User {

	public static void main(String[] args) {
		Integer[] arr = new Integer[3];
		MyStack <Integer> stack= new MyStack<Integer>(arr);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		add(stack);
	
		MyStack <MyDate> stack2 = new MyStack<MyDate> (new MyDate[2]);
		stack.push(new MyDate(1,1,2003);
	}
	
	public static void add(MyStack<Integer> st)
	{
		int sum=0;
		
		sum=sum+ (Integer)st.pop();
		sum=sum+ (Integer)st.pop();
		sum=sum+ (Integer)st.pop();
		System.out.println("Sum = "+sum);
	}

}
