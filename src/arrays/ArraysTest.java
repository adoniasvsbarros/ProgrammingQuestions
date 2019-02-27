package arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void closestToZeroBasicTest() {
		ClosestToZero ctz = new ClosestToZero();
		int[] A = {-2, 5, 6, 2, -3, -4};
		int expectedOutput = 2;
		assertEquals(expectedOutput, ctz.solution(A));
	}
	
	@Test
	public void cyclicRotationBasicTest() {
		CyclicRotation cr = new CyclicRotation();
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		int[] expectedOutput = {9, 7, 6, 3, 8}; 
		assertArrayEquals(expectedOutput, cr.solution(A, K));
	}
	
	@Test 
	public void oddOcurrencesInArrayBasicTest() {
		OddOccurrencesInArray oia = new OddOccurrencesInArray();
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		int expectedOutput = 7;
		assertEquals(expectedOutput, oia.solution(A));
		
		
	}
}
