package prefixSums;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrefixSumsTest {
	@Test
	public void GenomicRangeQuerySolution1BasicTest() {
		GenomicRangeQuery grqb = new GenomicRangeQuery();
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		String S = "CAGCCTA";
		int[] expectedOutput = {2, 4, 1};
		assertArrayEquals(expectedOutput, grqb.solution(S, P, Q));
		
	}
	
	@Test
	public void GenomicRangeQuerySolution2BasicTest() {
		GenomicRangeQuery grqb = new GenomicRangeQuery();
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		String S = "CAGCCTA";
		int[] expectedOutput = {2, 4, 1};
		assertArrayEquals(expectedOutput, grqb.solution2(S, P, Q));
		
	}
	
	@Test
	public void MushroomPickerBasicTest() {
		MushroomPicker mp = new MushroomPicker();
		int[] A = {2,3,7,5,1,3,9};
		int K = 4;
		int M = 6;
		int expectedOutput = 25;
		assertEquals(expectedOutput, mp.solution(K, M, A));
	}
	
	@Test
	public void PassingCarsBasicTest() {
		PassingCars ps = new PassingCars();
		int[] A = {0, 1, 0, 1, 1};
		int expectedOutput = 5;
		assertEquals(expectedOutput, ps.solution(A));
	}
	
}
