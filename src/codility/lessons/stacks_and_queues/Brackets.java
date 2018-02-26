package codility.lessons.stacks_and_queues;

import java.util.Stack;

/* Codility Lesson 7-1 Brackets 
 * @author Richard Kavanagh 
 */
public class Brackets {

	public static void main(String[] args) {
		String input = "{{()()}}";
		int result = solution(input);
		System.out.println(result);
	}

	public static int solution(String s) {

		Stack<Character> st = new Stack<Character>();
		for (Character ch : s.toCharArray()) {

			if (ch == '{' || ch == '(' || ch == '[') {
				st.push(ch);
			} else {

				if (st.isEmpty()) {
					return 0;
				}

				char top = st.pop();
				if (!isMatchingPair(top, ch)) {
					return 0;
				}
			}
		}

		int result = st.isEmpty() ? 1 : 0;
		return result;
	}

	public static boolean isMatchingPair(char left, char right) {
		if (left == '{' && right == '}') {
			return true;
		} else if (left == '[' && right == ']') {
			return true;
		} else if (left == '(' && right == ')') {
			return true;
		} else {
			return false;
		}
	}
}
