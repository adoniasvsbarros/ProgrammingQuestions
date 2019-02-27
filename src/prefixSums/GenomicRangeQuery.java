package prefixSums;
/*
Codility: https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/

A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

For example, consider string S = CAGCCTA and arrays P, Q such that:

    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
The answers to these M = 3 queries are as follows:

The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
Write a function:

class Solution { public int[] solution(String S, int[] P, int[] Q); }

that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.

Result array should be returned as an array of integers.

For example, given the string S = CAGCCTA and arrays P, Q such that:

    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
the function should return the values [2, 4, 1], as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
M is an integer within the range [1..50,000];
each element of arrays P, Q is an integer within the range [0..N − 1];
P[K] ≤ Q[K], where 0 ≤ K < M;
string S consists only of upper-case English letters A, C, G, T.
 */

public class GenomicRangeQuery {
	
	// O(N * M)
    public int[] solution(String S, int[] P, int[] Q) {
        int [] T = new int [S.length()];
        int [] result = new int[P.length];
        int min = Integer.MAX_VALUE;
        for(int i=0; i < S.length(); i++){
            if(S.charAt(i)=='A') T[i] = 1;
            if(S.charAt(i)=='C') T[i] = 2;
            if(S.charAt(i)=='G') T[i] = 3;
            if(S.charAt(i)=='T') T[i] = 4;
        }
        for(int i = 0; i < P.length; i++){
            for(int j = P[i]; j <= Q[i]; j++){
                min = Math.min(min,T[j]);
            }
            result[i] = min;
            min = 5;
        }
        return result;
    }
    
    // O (N + M)
    public int[] solution2(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[][] arr = new int[S.length()][4];
        
        for(int i=0 ; i < S.length(); i++){
            char c = S.charAt(i);
            if(c == 'A') arr[i][0] = 1;
            if(c == 'C') arr[i][1] = 1;
            if(c == 'G') arr[i][2] = 1;
            if(c == 'T') arr[i][3] = 1;
        }
        
        for(int i=1; i < S.length(); i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] += arr[i-1][j];
            }
        }
        
        for(int i = 0; i < P.length; i++){
            int x = P[i];
            int y = Q[i];
            int sub = 0;
            for(int j = 0; j < 4; j++){
                if(x-1 >= 0) sub = arr[x-1][j];
                if(arr[y][j] - sub > 0){
                    result[i] = j+1;
                    break;
                }
            }
        }
        
        return result;
    }
}
