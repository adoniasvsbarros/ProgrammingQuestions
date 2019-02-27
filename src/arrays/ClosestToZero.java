package arrays;
/*
Codingame
 
Implement closestToZero to return the integer in the array ints that is closest to zero.
If there are two integers equally close to zero, consider the positive element to be closer to zero
(example: if ints contains -5 and 5, return 5). If ints is null or empty, return 0.

Input: integers in ints have values ​ ranging from -2147483647 to 2147483647.
 */

public class ClosestToZero {
	
	public int solution(int[] ints){
		if(ints.equals(null) || ints.length == 0) return 0;
		
		int closest = Integer.MAX_VALUE;
		for(int i =0; i < ints.length; i++) {
			if(Math.abs(ints[i]) < Math.abs(closest)) {
				closest = ints[i];
			}
			if(Math.abs(ints[i]) == Math.abs(closest)){
				if(ints[i] > closest) {
					closest = ints[i];
				}
			}
		}
	
		return closest;
	}
}
