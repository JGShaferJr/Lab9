import java.util.Stack;

/**
 * 
 */

/**
 * @author jgsha
 *
 */
public class DelimiterChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DelimiterChecker  delimiterChecker = new  DelimiterChecker();
		
		String test1 = "[5*{4/(2+3)}]";
		String test2 = "abc{defg(ijk){l{mn}}op}q";
		String test3 = "abc[def}}{ghij{kl}";

		if (delimiterChecker.check(test1))
			System.out.println("test1 has matching delimiters.");
		else
			System.out.println("test1 does not have matching delimiters.");

		if (delimiterChecker.check(test2))
			System.out.println("test2 has matching delimiters.");
		else
			System.out.println("test2 does not have matching delimiters.");

		if (delimiterChecker.check(test3))
			System.out.println("test3 has matching delimiters.");
		else
			System.out.println("test3 does not have matching delimiters.");

	}

	public boolean check(String string) {
		Stack<String> stack = new Stack<String>();
		String temp = "";

		for (int x = 0; x < string.length(); x++) {
			temp = string.substring(x, x + 1);

			if (temp.equals("(") || temp.equals("{") || temp.equals("["))
				stack.push(temp);

			if (temp.equals(")")) {
				if (stack.peek().equals("("))
					stack.pop();
				else
					return false;
			}

			if (temp.equals("}")) {
				if (stack.peek().equals("{"))
					stack.pop();
				else
					return false;
			}

			if (temp.equals("]")) {
				if (stack.peek().equals("["))
					stack.pop();
				else
					return false;
			}

		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
