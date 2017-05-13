/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p069;

/**
 * @author Victor Young
 * @Todo: 
 * 
 */
public class Problem69_v2 {

	// O(log n) Solution using bit manipulation
	public int mySqrt(int x) {
		if (x == 0)
			return 0;
		
		int h = 0;
		// firstly, find the most significant bit
		while ((long)(1 << h) * (long)(1 << h) <= x) {
			h++;
		}
		h--;
		
		int b = h - 1;
		int res = (1 << h);
		while (b >= 0) {
			if ((long)(res | (1 << b)) * (long)(res | (1 << b)) <= x) {
				res |= (1 << b);
			}
			
			b--;
		}
		
		return res;
	}
	
}
