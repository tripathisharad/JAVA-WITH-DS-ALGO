package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Operation {
	int type;
	Object argument;

	Operation(int type, Object argument) {
		this.type = type;
		this.argument = argument;
	}
}





public class Practice {
	


	public static void main(String[] args) {
		
		
		
		String s = "{(([])[])[]]}";
		
		Stack<Character> m = new Stack<Character>();
		
		int l = s.length()%2;
		
		
		
		for(int i = 0; i<s.length(); i++) {
			
		if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
			   char t = s.charAt(i);
			   m.push(t);
			   
		}
		
		
		              if(m.isEmpty()) {
			             
			                break;
		                      }
		
		
		     if(s.charAt(i) == ')' && m.peek() == '(') {
				m.pop();
			}else if(s.charAt(i) == '}' && m.peek() == '{') {
		        m.pop();
		
	        }else if(s.charAt(i) == ']' && m.peek() == '[') {
	        	m.pop();
	        }
		

		}
		
		if(l== 0) {
			if(m.isEmpty()) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}else {
			System.out.println("false");
		}
		
		
		
	}	
	
}

