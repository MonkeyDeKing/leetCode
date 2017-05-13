/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p374;

/**
 * @author Victor Young
 * @Todo: 374. Guess Number Higher or Lower
 *	Easy.
 *	https://leetcode.com/problems/guess-number-higher-or-lower/
 */
public class Problem374 {

	public int guessNumber (int n) {
        int lo = 1, hi = n, mid, val;
        
        while (lo <= hi) {
        	// mid = (lo + hi) / 2; 和可能会溢出
            mid = lo + (hi - lo) / 2;
            
            val = guess(mid);
            if (val == -1) {
                hi = mid - 1;
            } else if (val == 1) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        
        return lo;
    }
	
	private int guess (int k) {
		return -2;
	}
	
}
