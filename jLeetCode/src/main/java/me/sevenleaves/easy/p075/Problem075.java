/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p075;

/**
 * @author Victor Young
 * @Todo: 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/#/description
 * Medium
 */
public class Problem075 {

    public void sortColors(int[] nums) {
        int[] acc = new int[3];
        
        for (int num : nums) {
            acc[num]++;
        }
        
        int idx = 0;
        for (int i = 0; i < acc[0]; i++)
        	nums[idx++] = 0;
        
        for (int i = 0; i < acc[1]; i++)
        	nums[idx++] = 1;
        
        for (int i = 0; i < acc[2]; i++)
        	nums[idx++] = 2;
        
    }
	
} // end of class.
