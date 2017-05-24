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
public class Problem240_v2 {
    
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null 
			|| matrix.length == 0
			|| matrix[0].length == 0) {
			return false;
		}
		
		final int m = matrix.length;
		final int n = matrix[0].length;
		
		int row = 0, col = n - 1;
		while (row < m && col >= 0) {
			if (target < matrix[row][col]) {
				col--;
			} else if (target > matrix[row][col]) {
				row++;
			} else {
				return true;
			}
		}
		
		return false;
    }
	
} // end of class.
