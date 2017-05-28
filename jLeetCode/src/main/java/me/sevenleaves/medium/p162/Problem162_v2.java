/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p162;

/**
 * @author Victor Young
 * @Todo: 162. Find Peak Element.
 * Medium.
 * https://leetcode.com/problems/find-peak-element/#/description.
 */
public class Problem162_v2 {

    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0)
        	return -1;
        
        int len = nums.length;
        if (len == 1) {
        	return 0;
        }
        
        int lo = 0, hi = len - 1, mid;
        while (lo < hi - 1) {
        	mid = lo + (hi - lo) / 2;
        	
        	if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
        		return mid;
        	} else if (nums[mid - 1] < nums[mid]) {
        		lo = mid + 1;
        	} else {
        		hi = mid - 1;
        	}
        }
        
    	return nums[lo] < nums[hi] ? hi : lo;
    }
    
}
