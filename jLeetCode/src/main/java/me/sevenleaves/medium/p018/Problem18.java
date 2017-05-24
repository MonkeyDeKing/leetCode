/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Victor Young
 * @Todo: 18. 4Sum.
 * Medium.
 * https://leetcode.com/problems/4sum/#/description.
 */
public class Problem18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> rs = new ArrayList<List<Integer>>(100);
        if (nums == null || nums.length < 4) 
        	return rs;
        Arrays.sort(nums);
        
        int lo, len = nums.length, hi, t, v;
        List<Integer> list = null;
        for (int i = 0; i < len - 3; i++) {
        	if (i > 0 && nums[i] == nums[i - 1])
        		continue;
        	
        	for (int j = len - 1; j > i + 2; j--) {
        		if (j < len - 1 && nums[j] == nums[j + 1])
        			continue;
        		
        		lo = i + 1;
        		hi = j - 1;
        		t = target - nums[i] - nums[j];
        		while (lo < hi) {
        			v = nums[lo] + nums[hi];
        			
        			if (v == t) {
        				list = new ArrayList<Integer>();
        				list.add(nums[i]);
        				list.add(nums[lo]);
        				list.add(nums[hi]);
        				list.add(nums[j]);
        				rs.add(list);
        				
        				do {
        					lo++;
        				} while (lo < hi && nums[lo] == nums[lo - 1]);
        				do {
        					hi--;
        				} while (lo < hi && nums[hi] == nums[hi + 1]);
        			} else if (v < t) {
        				do {
        					lo++;
        				} while (lo < hi && nums[lo] == nums[lo - 1]);
        			} else {
        				do {
        					hi--;
        				} while (lo < hi && nums[hi] == nums[hi + 1]);
        			}
        		}
        		
        	}
        }
        
    	return rs;
    }
	
} // end of class.
