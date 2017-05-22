/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p240;

/**
 * @author Victor Young
 * @Todo: 240. Search a 2D Matrix II.
 * Medium.
 * https://leetcode.com/problems/search-a-2d-matrix-ii/#/description.
 */
public class Problem240 {

    public boolean searchMatrix(int[][] matrix, int target) {
    	int m = matrix.length;
    	if (m == 0)
    		return false;
    	
    	int n = matrix[0].length;
    	
    	final int len = m * n - 1;
    	int lo = 0, hi = len, mid, row, col;
    	while (lo <= hi) {
    		mid = lo + (hi - lo) / 2;
    		row = mid / n;
    		col = mid % n;
    		
    		if (target < matrix[row][col]) {
    			hi = mid - 1;
    		} else if (target > matrix[row][col]) {
    			lo = mid + 1;
    		} else {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
	
} // end of class.
