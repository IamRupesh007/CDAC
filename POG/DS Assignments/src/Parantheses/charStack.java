package Parantheses;

	public class charStack {

		Node top;
		static class Node{//inner class //generally static 
			//scope within charstack visibility 
			char data;
			Node next;
			Node( char d)
			{
				data =d;
				next = null;
			}
		}
		public boolean isEmpty()
		{
			if(top==null)
			{
				return true;
			}
			else
				return false;
		}
		public char peek()
		{
			if(top==null)
			{
				return '*';
			}
			else
				return top.data;
		}
		public void push(char d)
		{
			Node new_node = new Node(d);
			if(top==null)
			{
				top = new_node;
			}
			else
			{
				new_node.next=top;
				top=new_node;
			}
		}
		public char pop()
		{
			char data;
			data = top.data;
			top = top.next;
			return data;
		}

		/*Traverse expr char by char ,
		 *  if char is opening parentheses ,then push it into stack 

		 *  if char is closing parenthesis then we will pop char from stack 
		 *   we will check popped char with current char (closing). let us write a different 
		 	function for matching the parenthesis() {} []

		stack= {  (
		 */

		boolean match (char a,char b)
		{
			if(a=='[' && b==']'  || a=='{' && b=='}' || a=='(' && b==')')
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		boolean check(String exp)//"{9+(8*5)-3}"
		{
			int i;
			char temp;
			for(i=0;i<exp.length();i++)
			{
				if(exp.charAt(i)=='('|| exp.charAt(i)=='{' || exp.charAt(i)=='[')
				{
					push(exp.charAt(i));
				}
				if(exp.charAt(i)==')'|| exp.charAt(i)=='}' || exp.charAt(i)==']')
				{
					if(top == null)//stack empty
					{
						System.out.println("Right Paranthesis are more.....");
						return false;
					}
					else
					{
						temp = pop();
						if(!(match(temp , exp.charAt(i))))
						{
							System.out.println("Mismatch paranthesis");
							System.out.println(temp+"  " +exp.charAt(i));
							return false;
						}
					}

				}
			}
			if(top == null)
			{
				System.out.println("Balanced....");
				return true;
			}
			else
			{
				System.out.println("Left paranthesis are more...");
				return false;
			}
		}


		public static void main(String[] args) {

			//ValidExp ve;
			charStack s = new charStack();
			String exp = new String ("{9+(8*5)-3}");
			if(s.check(exp))
			{
				System.out.println(" yes");
			}
			else
			{
				System.out.println(" no ");
			}
			
		}//end of main
	}//end of classs

