/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p050;

/**
 * @author Victor Young
 * @Todo: 50. Pow(x, n).
 * https://leetcode.com/problems/powx-n/#/description.
 * Medium.
 */
public class Problem50 {

    public double myPow(double x, int n) {
    	if (n == 0) 
    		return 1;
    	if (x == 1)
    		return 1;
    	if (x == -1) {
    		if (n % 2 == 0)
    			return 1;
    		else 
    			return -1;
    	}
    	
    	if (n < 0) {
    		if (n == Integer.MIN_VALUE) {
    			n = Integer.MAX_VALUE;
    			x = 1.0 / x;
    			return x * myPow(x * x, n / 2);
    		} else {
    			n = -n;
    			x = 1.0 / x;
    		}
    	}
    	
    	return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
    
}
