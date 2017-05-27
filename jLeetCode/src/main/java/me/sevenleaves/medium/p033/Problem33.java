/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p033;

/**
 * @author Victor Young
 * @Todo: 33. Search in Rotated Sorted Array.
 * Medium.
 * https://leetcode.com/problems/search-in-rotated-sorted-array/#/description.
 */
public class Problem33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
        	return -1;
        
        int len = nums.length;
        int lo = 0, hi = len - 1, mid;
        while (lo < hi) {
        	mid = lo + (hi - lo) / 2;
        	if (nums[mid] > nums[hi])
        		lo = mid + 1;
        	else
        		hi = mid;
        }
        
        int min = lo, realMid;
        lo = 0;
        hi = len - 1;
        while (lo <= hi) {
        	mid = lo + (hi - lo) / 2;
        	realMid = (mid + min) % len;
        	
        	if (target == nums[realMid]) {
        		return realMid;
        	} else if (target < nums[realMid]) {
        		hi = mid - 1;
        	} else {
        		lo = mid + 1;
        	}
        }
    	
    	return -1;
    }
}
