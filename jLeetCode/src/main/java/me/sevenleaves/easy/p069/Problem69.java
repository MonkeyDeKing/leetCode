/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p069;

/**
 * @author Victor Young
 * @Todo: 69. Sqrt(x)
 * https://leetcode.com/problems/sqrtx/#/description.
 * Easy.
 */
public class Problem69 {

	/**
	 * 由于int是有界的，所以减法相对加法更安全，除法相对乘法更安全。 
	 */
	public int mySqrt (int x) {
		if (x == 0)
			return 0;
		
		int lo = 1;
		int hi = x;
		
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			
			if (mid < x / mid) {
				lo = mid + 1;
			} else if (mid > x / mid) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		
		return lo-1;
	}
	
}
