/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p287;

import java.util.Arrays;

/**
 * @author Victor Young
 * @Todo: 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/#/description.
 * Medium.
 */
public class Problem287 {

	public int findDuplicate (int[] nums) {
		Arrays.sort(nums);

		final int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (find(nums[i], nums, i + 1, len)) {
				return nums[i];
			}
		}
		
		return -1;
	}
	
	public boolean find(int target, int[] nums, int lo, int hi) {
		int mid;
		while (lo <= hi) {
			 mid = lo + (hi - lo) / 2;
			 
			 if (target < nums[mid]) {
				 hi = mid - 1;
			 } else if (target > nums[mid]) {
				 lo = mid + 1;
			 } else {
				 return true;
			 }
		}
		
		return false;
	}
	
} // end of class.
