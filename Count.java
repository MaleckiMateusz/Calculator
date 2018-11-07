

import java.util.Stack;

public class Count {
	
	private static String equation = "";
	 private static String score; 
	
	 public Count(String inequation) {
		 equation = inequation;
		 score = "";
		 Coun();
	 }
	
	public static void Coun() {
		int MAXSTACK = 100;         //maximum stack capacity
		Stack stack = new Stack();  //stack of numbers
		int nHead = 0;              //stack peak indicator
		double number = 0; 			//arranging numbers
		double sum = 0;             //sum of two numbers
		double container = 0;       //container for difference and division
		
		for(int i=0; i<equation.length(); i++) {	
			
			switch (equation.charAt(i)) {
			case '+':
				sum = (double) stack.pop() + (double) stack.pop();
				stack.push(sum);
				break;
			case '-':
				container = (double) stack.pop();
				sum = (double) stack.pop() - container;
				stack.push(sum);
				break;
			case '*':
				sum = (double) stack.pop() * (double) stack.pop();
				stack.push(sum);
				break;
			case '/':
				container = (double) stack.pop();
				sum = (double) stack.pop() / container;
				stack.push(sum);
				break;
			}
			
			if(isDigit(equation.charAt(i))) {
				number = number * 10 + (equation.charAt(i)-'0');
			} 
			
			if(equation.charAt(i) == ' ' && isDigit(equation.charAt(i-1))) {
				stack.push(number);
				number = 0;
			}	
		}	
		String wyw = stack.pop().toString();
		if(wyw.charAt(wyw.length()-1) == '0')
		{
			for(int i=0;i<wyw.length()-2;i++)
			{
				score += wyw.charAt(i);
			}
		}
		else score = wyw;
			
	}

	private static boolean isDigit(char c) { //
		return ( c >= '0') && ( c <= '9' );
	}
	
	 public String toString() {
		  return score;
		 }
}
