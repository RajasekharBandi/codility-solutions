package codility.lessons.iterations;

/* Codility Lesson 1 Iterations 
 * @author Richard Kavanagh 20/02/2018
 */
public class BinaryGap {

	public static void main(String[] args) {
		int result = solution(1041);
		System.out.println(result);
	}

	public static int solution(int n) {

		int longestSeq = 0;
		int currentSeq = 0;
		boolean oneFlag = false;

		String binaryN = Integer.toBinaryString(n);
		for (char ch : binaryN.toCharArray()) {

			if (oneFlag && ch == '0') {
				currentSeq++;
			}
			else if (ch == '1') {

				if (oneFlag) {
					if (currentSeq > longestSeq) {
						longestSeq = currentSeq;
					}
					currentSeq = 0;
				}
				oneFlag = true;
			}
		}
		return longestSeq;
	}
}
