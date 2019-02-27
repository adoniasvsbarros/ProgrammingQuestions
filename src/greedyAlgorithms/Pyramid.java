package greedyAlgorithms;
/*
Codingame

Implement the method get(int l, int c) by finding a construction pattern from the sample below.

				c

	   0   1   2    3    4   5
	0  1 
	1  1 + 1
	2  1 + 2 + 1
l	3  1 + 3 + 3  + 1
	4  1 + 4 + 6  + 4  + 1
	5  1 + 5 + 10 + 10 + 5 + 1

Input: 0 ≤ c ≤ l ≤ 10000

Important notes:
at first try to save memory (RAM) space, next try to save CPU cycles if possible, 64 bits are not enough
to compute all results!

Examples:
get(4, 2) should return the string 6
get(5, 0) should return the string 1
get(67, 34) should return the string 14226520737620288370

 */
import java.math.BigInteger;

public class Pyramid {
	
	public String solution(int l, int c) {
		int max = Math.max(l, c);
		BigInteger[][] m = new BigInteger[max+1][max+1];
		
		for(int i = 0; i <= l; i++){
			for(int j = 0; j <= i; j++){
				if(i==j || j==0) {
					m[i][j] = new BigInteger("1");
				}
				else { 
					BigInteger aux = m[i-1][j].add(m[i-1][j-1]);
					m[i][j] = new BigInteger(aux.toByteArray());
				}
			}
		}
		return (m[l][c]).toString();
	}
	
	

}
