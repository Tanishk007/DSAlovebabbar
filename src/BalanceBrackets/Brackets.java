package BalanceBrackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
	static boolean balanbrackt(String expr) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i=0;i<expr.length();i++) {
			char x = expr.charAt(i);
			
			if( x == '(' || x == '[' || x== '{') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch(x) {
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
				
			case ']':
			check = stack.pop();
			if(check == '(' || check == '{')
				return false;
			break;
			
			case '}':
				check = stack.pop();
				if(check == '(' || check == '[')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[]args) {
		String exp = "([{}])";
		if(balanbrackt(exp))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

}

// Time complexity :- O(N)
// Space complexity :- O(N)