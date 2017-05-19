/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p287;

import java.util.Random;

/**
 * @author Victor Young
 * @Todo: 287. Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/#/description.
 * Medium.
 */
public class Problem287_v2 {

	public int findDuplicate (int[] nums) {
		shuffle (nums);
		return quickFind(nums, 0, nums.length-1);
	}
	
	public int quickFind (int[] nums, int lo, int hi) {
		if (lo >= hi)
			return -1;
		
		int gard = nums[lo];
		int i = lo, j = hi + 1;
		
		while (true) {
			while (nums[++i] < gard) {
				if (i == hi) {
					break;
				}
			}
			
			while (gard < nums[--j]) {
				if (j == lo)
					break;
			}
			
			if (i > j) {
				break;
			} else if (i == j) {
				if (nums[i] == gard) {
					return nums[i];
				} else {
					break;
				}
			}
			
			if (nums[i] == gard)
				return nums[i];
			if (nums[j] == gard) 
				return nums[j];
			
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
		nums[lo] = nums[j];
		nums[j] = gard;
		
		return 1 + quickFind(nums, lo, j - 1) + quickFind(nums, j + 1, hi);
	}
	
	public void shuffle (int[] nums) {
		Random rdm = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < nums.length; i++) {
			int idx = rdm.nextInt(nums.length);
			
			int tmp = nums[idx];
			nums[idx] = nums[i];
			nums[i] = tmp;
		}
	}
	
} // end of class.
