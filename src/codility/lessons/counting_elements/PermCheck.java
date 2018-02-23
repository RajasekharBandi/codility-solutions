package codility.lessons.counting_elements;

/*
 * Codility Lesson 4-1 Permutation Check  
 * @author Richard Kavanagh
 */
public class PermCheck {

	public static void main(String[] args) {
		int[] input = { 4, 1, 3, 2 };
		int result = solution(input);
		System.out.println(result);
	}

	public static int solution(int[] a) {

		int arraySize = a.length;
		boolean[] elemPresent = new boolean[arraySize];

		for (int i = 0; i < elemPresent.length; i++) {

			int x = a[i];

			if (a[i] > arraySize) {
				return 0;
			}

			if (elemPresent[x - 1]) {
				return 0;
			} else {
				elemPresent[x - 1] = true;
			}

		}
		return 1;
	}
}
