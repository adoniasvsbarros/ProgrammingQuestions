package dynamicProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicProgrammingTest {

	@Test
	public void numberSolitaireBasicTest() {
		NumberSolitaire ns = new NumberSolitaire();
		int[] A = {1, -2, 0, 9, -1, -2};
		int expectedOutput = 8;
		assertEquals(expectedOutput, ns.solution(A));
	}
}