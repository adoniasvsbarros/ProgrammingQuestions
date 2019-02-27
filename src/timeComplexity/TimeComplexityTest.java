package timeComplexity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeComplexityTest {
	@Test
	public void PermMissingElemBasicTest() {
		PermMissingElem pme = new PermMissingElem();
		int[] A = {2, 3, 1, 5};
		int expectedOutput = 4;
		assertEquals(expectedOutput, pme.solution(A));
	}
	
	@Test
	public void FrogJmpBasicTest() {
		FrogJmp fj = new FrogJmp();
		int X = 10;
		int Y = 85;
		int D = 30;
		int expectedOutput = 3;
		assertEquals(expectedOutput, fj.solution(X, Y, D));
		
	}
}
