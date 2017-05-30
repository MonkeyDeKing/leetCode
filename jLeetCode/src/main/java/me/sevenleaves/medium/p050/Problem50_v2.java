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
public class Problem50_v2 {
	
    public double myPow(double x, int n) {
    	if (n == 0) 
    		return 1.;
    	if (x == 1)
    		return 1.;
    	if (x == -1) {
    		if (n % 2 == 0)
    			return 1.;
    		else 
    			return -1.;
    	}
    	
    	if (n < 0){
    		if (n == Integer.MIN_VALUE)
    			return 1.0 / (x * myPow(x, Integer.MAX_VALUE));
    		else 
    			return 1.0 / myPow(x, -n);
    	}
    	
    	double ans = 1.0;
    	while (n > 0) {
    		if ((n & 1) > 0) {
    			ans = ans * x;
    		}
    		
    		x = x * x;
    		n = n >> 1;
    	}
    	
    	return ans;
    }
    
}
