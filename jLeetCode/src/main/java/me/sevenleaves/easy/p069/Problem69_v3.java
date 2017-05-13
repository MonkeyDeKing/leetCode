/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p069;

/**
 * @author Victor Young
 * @Todo: 
 * 
 */
public class Problem69_v3 {

	// Newton method.
	public int mySqrt(int x) {
		if (x == 0)
			return 0;
		
		long r = x;
		while (r > x / r) {
			r = (r + x / r) / 2;
		}
		
		return (int)r;
	}
	
}
