/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p367;

/**
 * @author Victor Young
 * @Todo: 367. Valid Perfect Square
 * 
 *        https://leetcode.com/problems/valid-perfect-square/#/description
 *        Medium.
 */
public class Problem367 {

	public boolean isPerfectSquare(int num) {
		int lo = 0, hi = (num + 1) / 2;
		
		long mid, sqr;
		while (lo <= hi) {
			mid = (lo + hi) >>> 1;
			sqr = mid * mid;
			
			if (sqr == num) {
				return true;
			} else if (sqr < num) {
				lo = (int) mid + 1;
			} else {
				hi = (int) mid - 1;
			}
		}
		
		return false;
	}

} // end of class.
