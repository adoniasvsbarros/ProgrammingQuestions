package iterations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IterationsTest {
	@Test
	public void BInaryGapTest() {
		BinaryGap bg = new BinaryGap();
		int N = 1041;
		int expectedOutput = 5;
		assertEquals(expectedOutput, bg.solution(N));
		
	}
}