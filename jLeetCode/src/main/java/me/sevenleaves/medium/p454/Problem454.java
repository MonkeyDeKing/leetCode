/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p454;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor Young
 * @Todo: 454. 4Sum II.
 * https://leetcode.com/problems/4sum-ii/#/description.
 * Medium.
 */
public class Problem454 {
	
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
    	int rs = 0;
    	if (a == null || b == null || c == null || d == null)
    		return rs;
    	if (a.length == 0 || b.length == 0 || c.length == 0 || d.length == 0)
    		return rs;
    	
    	Arrays.sort(a);
    	Arrays.sort(b);
    	Arrays.sort(c);
    	Arrays.sort(d);
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < a.length; i++)  {
    		
    		for (int j = 0; j < b.length; j++) {
    			
    			int sum2 = a[i] + b[j];
    			map.put(sum2, map.getOrDefault(sum2, 0) + 1);
    		}
    	}
    	
    	for (int i = 0; i < c.length; i++)  {
    		
    		for (int j = 0; j < d.length; j++) {
    			
    			int sum = 0 - c[i] - d[j];
    			rs += map.getOrDefault(sum, 0);
    		}
    	}
    	
    	return rs;
    }
    
}
