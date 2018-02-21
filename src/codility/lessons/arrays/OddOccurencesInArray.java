package codility.lessons.arrays;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

/* Codility Lesson 2-1 Arrays 
 * @author Richard Kavanagh 21/02/18
 */
public class OddOccurencesInArray {

	public static void main(String[] args) {
		int[] a = { 9, 3, 9, 3, 9, 7, 9 };
		int result = solution(a);
		System.out.println(result);
	}

	public static int solution(int[] array) {

		HashMap<Integer, Integer> occurances = new HashMap<>();

		for (int e : array) {
			if (occurances.containsKey(e)) {
				occurances.remove(e);
			} else {
				occurances.put(e, 1);
			}
		}

		List<Integer> oddList = new ArrayList<Integer>(occurances.keySet());
		return oddList.get(0);
	}
}
