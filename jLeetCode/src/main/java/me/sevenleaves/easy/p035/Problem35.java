/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p035;

/**
 * @author Victor Young
 * @Todo: 35. Search Insert Position
 *	Medium.
 *	https://leetcode.com/problems/search-insert-position/#/description
 */
public class Problem35 {

	public int searchInsert (int[] nums, int target) {
		int lo = 0, hi = nums.length-1, mid;
		
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			
			if (target < nums[mid]) {
				hi = mid - 1;
			} else if (target > nums[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return lo;
	}
	
} // end of class.
