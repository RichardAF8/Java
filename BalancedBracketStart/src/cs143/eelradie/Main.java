package cs143.eelradie;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		String input = "{()}";

		String leftBrackets = "[{(";
		String rightBrackets = "]})";

		if (balanced(input, leftBrackets, rightBrackets)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Unbalanced");
		}
	}

	public static boolean balanced(String checkBalanced, String leftBrackets, String rightBrackets) {
		Stack<Character> stack = new Stack<>();
		int x = 0;

		HashMap<Character, Character> bracket = new HashMap<>();
		for (; x < leftBrackets.length(); x++) {
			bracket.put(rightBrackets.charAt(x), leftBrackets.charAt(x));

		}
		for (x = 0; x < checkBalanced.length(); x++) {
			if (x < checkBalanced.length() / 2) {
				stack.push(checkBalanced.charAt(x));
			} else {
				if (bracket.containsKey(checkBalanced.charAt(x))
						&& bracket.get(checkBalanced.charAt(x)) == stack.top()) {
					stack.pop();
				}

			}
		}
		if (stack.isEmpty() && checkBalanced.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
