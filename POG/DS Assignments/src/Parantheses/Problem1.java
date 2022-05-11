package Parantheses;

public class Problem1 {
	public static void main(String[] args) {
		//validExp ve;
		String exp = new String("9+ (8*5) - 3");
		if(ve.check(exp))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	

	public class charStack{
		Node top;

		static class Node{
			char data;
			Node next;

			Node (char d)
			{
				data=d;
				next=null;
			}
		}
		public boolean isEmpty()
		{
			if(top==null)
				return true;
			else
				return false;
		}

		public char peek()
		{
			if(top==null) return '*';
			else return top.data;
		}
		public void push(char d)
		{
			Node new_node = new Node(d);
			if(top==null) top=new_node;
			else {
				new_node.next=top;

				top=new_node;
			}
		}

		public char pop()
		{
			char data;
			data=top.data;
			top = top.next;
			return data;
		}
		/*Traverse expression char by char
		 * if char is opening parantheses then push it into stack
		 * 
		 * if char is closing parantheses then we will pop char from stack and
		 * then we will check popped char with current char(closing)
		 * let us write a diff function for matching paranthesis () {} []
		 *
		 */
		boolean match(char a, char b)
		{
			if (a=='[' && b==']')
				return true;
			if (a=='{' && b=='}')
				return true;
			if (a=='(' && b==')')
				return true;
			else
				return false;
		}


		boolean chech(String exp)// "{ 9+ (8*5) -3 }
		{ charStack s = new charStack();
			int i; 
			char temp;
			for(i=0;i<exp.length();i++)
			{
				if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[')
					push(exp.charAt(i));
				if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']')
				{
					if(top==null)//stack empty
					{
						System.out.println("Right parenthesis are more");
						return false;
					}
					else
					{
						temp=pop();
						if(!(match(temp,exp.charAt(i)))) {
							System.out.println("MisMatched parantheses are : "+temp+" "+exp.charAt(i));
							return false;
						}
					}
				}
			}
			if(top==null)
			{
				System.out.println("Balanced ... ");
				return true;
			}
			else {
				System.out.println("Left paranthese are more ... ");
				return false;
			}
		}//end of chech
		
	}//end of main
}//end of class








