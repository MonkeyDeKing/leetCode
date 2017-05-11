/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p324;

import java.util.Arrays;

/**
 * @author Victor Young
 * @Todo: 324. Wiggle Sort II
 * https://leetcode.com/problems/wiggle-sort-ii/#/description
 * Medium
 * 
 */
public class Problem324 {

	public void wiggleSort(int[] nums) {
		Arrays.sort(nums);
		
		int len = nums.length;
		
		int[] rs = new int[len];
		int lo = (len+1) / 2, hi = len;
		for (int i = 0; i < len; i++) {
			if (i%2 == 0) {
				rs[i] = nums[--lo];
			} else {
				rs[i] = nums[--hi];
			}
		}
		
		for (int i = 0; i < len; i++) {
			nums[i] = rs[i];
		}
		printArray(rs);
	}
	
	private void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

} // end of class.
