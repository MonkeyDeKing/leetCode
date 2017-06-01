/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p034;

/**
 * @author Victor Young
 * @Todo: 34. Search for a Range.
 * https://leetcode.com/problems/search-for-a-range/#/description.
 * Medium.
 */
public class Problem34 {

	public int[] searchRange(int[] nums, int target) {
		int[] ans = {-1, -1};
		if (nums == null || nums.length == 0)
			return ans;
		
		int len = nums.length, lo = 0, hi = len - 1, mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			
			if (target > nums[mid]) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		if (lo < len && nums[lo] == target) {
				ans[0] = lo;
		} else {
			return ans;
		}
		
		lo = 0;
		hi = len - 1;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			
			if (target < nums[mid]) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		ans[1] = lo - 1;
		
		return ans;
	}
	
}
