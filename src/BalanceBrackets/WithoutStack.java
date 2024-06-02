package BalanceBrackets;

public class WithoutStack {
	
	public static boolean breacketsbalnce(String s) {
		int i=-1;
		char[] stack  = new char[s.length()];
		for(char ch :s.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[')
				stack[++i] = ch;
			else {
                if (i >= 0
                    && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
		}
		return  i == -1;
	}
	public static void main(String[]args) {
		String expr = "{()}[]";
		if(breacketsbalnce(expr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

}
