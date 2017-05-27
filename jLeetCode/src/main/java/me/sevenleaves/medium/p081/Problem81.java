/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p081;

/**
 * @author Victor Young
 * @Todo: 81. Search in Rotated Sorted Array II.
 * Medium.
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/#/description.
 */
public class Problem81 {

    public boolean search(int[] nums, int target) {
    	if (nums == null || nums.length == 0)
        	return false;
        
    	int lo = 0, hi = nums.length - 1, mid;
        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            //If we know for sure right side is sorted or left side is unsorted
            if (nums[mid] < nums[hi] || nums[mid] < nums[lo]) {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            //If we know for sure left side is sorted or right side is unsorted
            } else if (nums[mid] > nums[lo] || nums[mid] > nums[hi]) {
                if (target < nums[mid] && target >= nums[lo]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            //If we get here, that means nums[start] == nums[mid] == nums[end], then shifting out
            //any of the two sides won't change the result but can help remove duplicate from
            //consideration, here we just use end-- but left++ works too
            } else {
                hi--;
            }
        }
        
        return false;
    }
	
} // end of class.
