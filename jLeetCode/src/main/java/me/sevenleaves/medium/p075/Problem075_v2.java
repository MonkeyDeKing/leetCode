/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p075;

/**
 * @author Victor Young
 * @Todo: 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/#/description
 * Medium
 */
public class Problem075_v2 {
    
	public void sortColors(int[] nums) {
    	int idx = 0, lo = 0, hi = nums.length-1;
    	
    	while (idx <= hi) {
    		if (nums[idx] == 2)
    			swap(nums, idx, hi--);
    		else if (nums[idx] == 0) 
    			swap(nums, idx++, lo++);
    		else
    			idx++;
    	}
    	
    }
	
	private void swap (int[] nums, int i, int j) {
		if (i == j)
			return;
		
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
} // end of class.
