package greedyAlgorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class greedyAlgorithmTest {

	@Test
	public void maxNonOverlappingSegmentsBasicTest() {
		MaxNonoverlappingSegments mns = new MaxNonoverlappingSegments();
		int[] A = {1, 3, 7, 9 ,9};
		int[] B = {5, 6, 7, 9, 10};
		int expectedOutput = 3;
		assertEquals(expectedOutput, mns.solution(A, B));
	}
	
	@Test
	public void pyramidBasicTest() {
		Pyramid p = new Pyramid();
		int l = 67;
		int c = 34;
		String expectedOutput = "14226520737620288370";
		assertEquals(expectedOutput, p.solution(l, c));
	}
	
	@Test
	public void tieRopesBasicTest() {
		TieRopes tr = new TieRopes();
		int[] A = {1, 2, 3, 4, 1, 1, 3};
		int K =4;
		int expectedOutput = 3;
		assertEquals(expectedOutput, tr.solution(K, A));
	}

}
