/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p153;

/**
 * @author Victor Young
 * @Todo: 153. Find Minimum in Rotated Sorted Array.
 * Medium.
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/#/description.
 */
public class Problem153 {

    public int findMin(int[] nums) {
        if (nums.length == 1 || nums[0] < nums[nums.length - 1])
        	return nums[0];
        
        int lo = 0, hi = nums.length - 1, mid;
        while (lo < hi) {
        	mid = lo + (hi - lo) / 2;
        	if (nums[mid] < nums[hi]) {
        		hi = mid;
        	} else {
        		lo = mid + 1;
        	}
        }
    	
    	return nums[hi];
    }
	
} // end of class.
