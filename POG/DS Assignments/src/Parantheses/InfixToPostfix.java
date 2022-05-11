package Parantheses;

public class InfixToPostfix {
	
	public static int prec(char symbol)
	{
		switch(symbol)
		{
		case '(' : 
			return 0;
		case '+' :
		case '-' :
			return 1;
		case '*' :
		case '/' :
		case '%' : 
			return 2;
		case '^' :
			return 3;
		default : 
			return 0;
		}
	}
	
	static String infix_to_postfix(String infix)
	{
		charStack st = new charStack();
		int p=0;
		char symbol,next;
		char post[]= new char[infix.length()+1];
		for (int i = 0; i < infix.length(); i++) {
			symbol = infix.charAt(i);
			if(symbol!=32)
			{
				switch(symbol)
				{
				case '(' : st.push(symbol);break;
				case ')' : 
					while((next = st.pop())!=  '('  )
					post[p++]=next; break;
				case '+' : 
				case '-' :
				case '*' :
				case '/' :
				case '%' :
				case '^' :
					while((!st.isEmpty() && prec(st.peek()) >= prec(symbol)))
						post[p++]=st.pop();
					
					st.push(symbol);
					break;
					
				default : //if symbol is operand
					post[p++] = symbol;
				}
			}
		}//end of for
		
		while(!st.isEmpty())
			post[p++]=st.pop();
		String postfix = new String(post);
		return postfix;
	}//end of function
}
