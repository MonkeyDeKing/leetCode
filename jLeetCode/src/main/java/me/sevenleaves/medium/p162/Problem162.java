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
public class Problem162 {

    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0)
        	return -1;
        
        int len = nums.length;
        if (len == 1) {
        	return 0;
        }
        
        if (nums[0] > nums[1])
        	return 0;
        
        if (nums[len - 1] > nums[len - 2])
        	return len - 1;
    	
        for (int i = 1; i < len - 1; i++) {
        	
        	if (nums[i] > nums[i+1])
        		return i;
        }
        
    	return -1;
    }
    
}
