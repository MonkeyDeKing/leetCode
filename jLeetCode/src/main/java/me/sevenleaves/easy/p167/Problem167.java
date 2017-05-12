/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p167;

/**
 * @author Victor Young
 * @Todo: 167. Two Sum II - Input array is sorted
 *		https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 *		Medium.
 */
public class Problem167 {
	
    public int[] twoSum(int[] numbers, int target) {
    	int[] rs = {1, 1};
    	
    	int x, idx;
    	for (int i = 0; i < numbers.length; i++) {
    		x = target - numbers[i];
    		
    		idx = search (x, numbers, i, numbers.length-1);
    		
    		if (idx != -1) {
    			rs[0] = i + 1;
    			rs[1] = idx + 1;
    			return rs;
    		}
    	}
    	
    	return rs;
    }
    
    public int search (int target, int[] numbers, int lo, int hi) {
    	int mid;
    	
    	while (lo <= hi) {
    		mid  = (lo + hi) / 2;
    		if (target > numbers[mid]) {
    			lo = mid + 1;
    		} else if (target < numbers[mid]) {
    			hi = mid - 1;
    		} else {
    			return mid;
    		}
    	}
    	
    	return -1;
    }
    
} // end of class.
