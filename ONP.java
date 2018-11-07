

import java.util.Stack;
import java.util.StringTokenizer;

public class ONP {
	 private String wyrazenieInfiksowe;
	 private String wyrazeniePostfiksowe; 
	 
	 public ONP(String wyrazenie) {
	  wyrazenieInfiksowe = wyrazenie;
	  wyrazeniePostfiksowe = "";
	  infiksNaPostfiks();
	 }

	 private void infiksNaPostfiks() {
	        
	  Stack<String> stos = new Stack<String>();
	        
	  StringTokenizer st = new StringTokenizer(wyrazenieInfiksowe, "+-*/()", true);
	        
	  while(st.hasMoreTokens()) {

	   String s = st.nextToken();
	         
	   if( s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
	    while(!stos.empty() && priorytet(stos.peek()) >= priorytet(s)) 
	     wyrazeniePostfiksowe += stos.pop()  + " ";
	    stos.push(s);
	   }
	   else if(s.equals("(")) stos.push(s);
	   else if(s.equals(")")) {
	    while(!stos.peek().equals("(")) wyrazeniePostfiksowe += stos.pop() + " ";
	    stos.pop();
	   }
	   else wyrazeniePostfiksowe += s  + " ";
	  }
	  while(!stos.empty()) wyrazeniePostfiksowe += stos.pop()  + " ";
	 } 
	  
	 private static int priorytet(String operator) {
	  if(operator.equals("+") || operator.equals("-")) return 1;
	  else if(operator.equals("*") || operator.equals("/")) return 2;
	  else return 0;
	 }
	 
	 public String toString() {
	  return wyrazeniePostfiksowe;
	 }
	}
