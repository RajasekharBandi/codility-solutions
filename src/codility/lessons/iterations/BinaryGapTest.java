package codility.lessons.iterations;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryGapTest {
	
	private int input;
	private int result;
	
	@Test
	public void testBasic() {
		input = 1041;
		result = BinaryGap.solution(input);
		assertEquals(result, 5);
	}
	
	@Test
	public void testZero() {
		input = 0;
		result = BinaryGap.solution(input);
		assertEquals(result, 0);
	}
	
	@Test
	public void testAllOnes() {
		input = 63;
		result = BinaryGap.solution(input);
		assertEquals(result, 0);
	}
	
	@Test
	public void testTrailingZeroes() {
		input = 328;
		result = BinaryGap.solution(input);
		assertEquals(result, 2);
	}
	
	@Test
	public void testSmallInput() {
		input = 19;
		result = BinaryGap.solution(input);
		assertEquals(result, 2);
	}
	
	@Test
	public void testLargeInput() {
		input = 561892;
		result = BinaryGap.solution(input);
		assertEquals(result, 3);
	}
}
