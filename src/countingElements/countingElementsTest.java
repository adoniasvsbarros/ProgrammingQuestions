package countingElements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class countingElementsTest {

	@Test
	public void frogRiverOneBasicTest() {
		FrogRiverOne fro = new FrogRiverOne();
		int X = 5;
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		int expectedOutput = 6;
		assertEquals(expectedOutput, fro.solution(X, A));
	}
	
	@Test
	public void missingIntegerBasicTest() {
		MissingInteger mi = new MissingInteger();
		int[] A = {1, 3, 6, 4, 1, 2};
		int expectedOutput = 5;
		assertEquals(expectedOutput, mi.solution(A));
	}
	
	@Test
	public void permCheckBasicTest() {
		PermCheck pc = new PermCheck();
		int[] A = {4, 1, 3, 2};
		int expectedOutput = 1;
		assertEquals(expectedOutput, pc.solution(A));
	}
}
