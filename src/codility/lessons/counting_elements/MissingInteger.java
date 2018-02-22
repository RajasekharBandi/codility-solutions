package codility.lessons.counting_elements;

import java.util.HashSet;

/* Codility Lesson 4-3 Counting Elements 
 * @author Richard Kavanagh 22/02/18
 */
public class MissingInteger {

	public static void main(String[] args) {
		int[] input = { 1, 3, 6, 4, 1, 2 };
		int result = solution(input);
		System.out.println(result);
	}

	public static int solution(int[] a) {

		HashSet<Integer> elements = new HashSet<>();
		for (int i : a) {
			elements.add(i);
		}

		int count = 1;
		while (elements.contains(count)) {
			count++;
		}
		return count;
	}
}
