package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortingTest {
	@Test
	public void DistinctBasicTest() {
		Distinct d = new Distinct();
		int[] A = {2, 1, 1, 2, 3, 1};
		int expectedOutput = 3;
		assertEquals(expectedOutput, d.solution(A));
	}
	
	@Test
	public void MaxProductOfThreeBasicTest() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] A = {-3, 1, 2, -2, 5, 6};
		int expectedOutput = 60;
		assertEquals(expectedOutput, mpt.solution(A));
	}
	
	@Test
	public void TriangleBasicTest() {
		Triangle t = new Triangle();
		int[] A = {10, 2, 5, 1, 8, 20};
		int expectedOutput = 1;
		assertEquals(expectedOutput, t.solution(A));
	}
}
