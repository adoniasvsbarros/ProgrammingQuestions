package stackQueues;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackQueuesTest {
	@Test
	public void bracketsBasicTest() {
		Brackets b = new Brackets();
		String S = "{[()()]}";
		int expectedOutput = 1;
		assertEquals(expectedOutput, b.solution(S));
	}
	
	@Test
	public void fishBasicTest() {
		Fish f = new Fish();
		int[] A = {4, 3, 2, 1, 5};
		int[] B = {0, 1, 0, 0, 0};
		int expectedOutput = 2;
		assertEquals(expectedOutput, f.solution(A, B));
	}
	
	@Test
	public void nestingBasicTest() {
		Nesting n = new Nesting();
		String S = "(()(())())";
		int expectedOutput = 1;
		assertEquals(expectedOutput, n.solution(S));
	}
}
