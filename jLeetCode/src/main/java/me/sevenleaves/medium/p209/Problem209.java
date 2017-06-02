/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p209;

/**
 * @author Victor Young
 * @Todo: 209. Minimum Size Subarray Sum.
 * Medium.
 * https://leetcode.com/problems/minimum-size-subarray-sum/#/description
 */
public class Problem209 {
    public int minSubArrayLen(int s, int[] nums) {
    	if (nums == null || nums.length == 0)
    		return 0;
    	
    	int ans = Integer.MAX_VALUE;
        int acc = 0, min = 0, len = nums.length, lo, hi;
    	for (lo = 0, hi = 0; hi < len; ) {
    		while (acc < s && hi < len) {
    			acc += nums[hi++];
    			min++;
    		}
    		
    		while (acc >= s) {
    			acc -= nums[lo++];
    			min--;
    		}
    		
    		ans = (min + 1 < ans) ? min + 1 : ans;
    	}
    	System.out.println(ans + " " + acc);
    	if (ans > len || (ans == len && acc + nums[0] < s))
    		return 0;
    	
    	return ans;
    }
}
