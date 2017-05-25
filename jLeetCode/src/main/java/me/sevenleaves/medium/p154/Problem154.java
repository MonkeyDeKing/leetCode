/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p154;

/**
 * @author Victor Young
 * @Todo: 154. Find Minimum in Rotated Sorted Array II.
 * Medium.
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/#/description
 */
public class Problem154 {

    public int findMin(int[] nums) {
        if (nums.length == 1 || nums[0] < nums[nums.length - 1])
        	return nums[0];
        
        int lo = 0, hi = nums.length - 1, mid = lo + (hi - lo) / 2;
        while (lo < hi) {
        	mid = lo + (hi - lo) / 2;
        	
        	if (nums[mid] < nums[hi]) {
        		hi = mid;
        	} else if (nums[mid] > nums[hi]) {
        		lo = mid + 1;
        	} else {
        		hi--;
        	}
        }
    	
    	return nums[hi];
    }
	
} // end of class.
