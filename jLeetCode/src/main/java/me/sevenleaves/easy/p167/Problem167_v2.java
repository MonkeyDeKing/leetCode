/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p167;

/**
 * @author Victor Young
 * @Todo: 
 * Time complexity: O(lg n)
 * Space complexity: O(1)
 */
public class Problem167_v2 {

	public int[] twoSum(int[] nums, int target) {
		int[] rs = new int[2];
		
		if (nums == null || nums.length < 2) {
			return rs;
		}
		
		int lo = 0, hi = nums.length-1;
		
		while (lo < hi) {
			int value = nums[lo] + nums[hi];
			
			if (value == target) {
				rs[0] = lo + 1;
				rs[1] = hi + 1;
				return rs;
			} else {
				
				int mid = (lo + hi) / 2;
				if (target < value) {
					
					if (nums[lo] + nums[mid] == target) {
						rs[0] = lo + 1;
						rs[1] = hi + 1;
						return rs;
					} else if (target < nums[lo] + nums[hi]) {
						hi = mid - 1;
					} else {
						int pre = nums[hi];
						while (pre == nums[hi]) {
							hi--;
						}
					}
					
				} else {
					
					if (nums[hi] + nums[mid] == target) {
						rs[0] = lo + 1;
						rs[1] = hi + 1;
						return rs;
					} else if (target > nums[hi] + nums[mid]) {
						lo = mid + 1;
					} else {
						int pre = nums[lo];
						while (pre == nums[lo]) {
							lo++;
						}
					}
					
				}
				
			}
			
		}
		
		return rs;
	}
	
} // end of class.
