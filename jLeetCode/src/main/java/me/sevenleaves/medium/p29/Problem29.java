/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p29;

/**
 * @author Victor Young
 * @Todo: 29. Divide Two Integers.
 * Medium.
 * https://leetcode.com/problems/divide-two-integers/#/description.
 */
public class Problem29 {

    public int divide(int dividend, int divisor) {
        int ans = Integer.MAX_VALUE;
    	
        if (divisor == 0)
        	return ans;
        
        boolean pstv = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
        	pstv = false;
        
        long longDividend = dividend < 0 ? -(long) dividend : (long) dividend;
        long longDivisor = divisor < 0 ? -(long) divisor : (long) divisor;
        
        if (longDivisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
        	return ans;
        if (longDividend == 0 || longDividend < longDivisor)
        	return 0;
    	
        long rs = longDivide(longDividend, longDivisor);
        ans = pstv ? (int)rs : (int)-rs;
        
    	return ans;
    }
    
    public long longDivide (long dividend, long divisor) {
    	if (dividend < divisor)
    		return 0;
    	
    	long sum = divisor;
    	long acc = 1;
    	while ((sum + sum) <= dividend) {
    		sum += sum;
    		acc += acc; 
    	}
    	
    	return acc + longDivide(dividend - sum, divisor);
    }
	
}
