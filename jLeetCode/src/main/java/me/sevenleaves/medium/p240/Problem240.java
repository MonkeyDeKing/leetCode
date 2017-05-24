/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p240;

/**
 * @author Victor Young
 * @Todo: 240. Search a 2D Matrix II
 * Medium.
 * https://leetcode.com/problems/search-a-2d-matrix-ii/#/description.
 */
public class Problem240 {
    
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null 
			|| matrix.length == 0
			|| matrix[0].length == 0) {
			return false;
		}
		
		final int m = matrix.length;
		final int n = matrix[0].length;
//		final int len = m * n - 1;
		if (target < matrix[0][0] || target > matrix[m-1][n-1])
			return false;
		
		for (int[] nums : matrix) {
			if (search(nums, 0, n-1, target))
				return true;
		}
		
		return false;
    }
	
	public boolean search (int[] nums, int lo, int hi, int target) {
		if (nums == null || nums.length == 0 || target < nums[0])
			return false;
		
		
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			
			if (target < nums[mid]) {
				hi = mid - 1;
			} else if (target > nums[mid]) {
				lo = mid + 1;
			} else {
				return true;
			}
		}
		
		return false;
	}
	
} // end of class.
