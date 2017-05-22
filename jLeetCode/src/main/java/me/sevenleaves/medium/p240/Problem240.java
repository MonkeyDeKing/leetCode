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
    	int lo = 0, hi = len, mid, xy[];
    	while (lo <= hi) {
    		mid = lo + (hi - lo) / 2;
    		xy = map(mid, n);
    		
    		if (target < matrix[xy[0]][xy[1]]) {
    			hi = mid - 1;
    		} else if (target > matrix[xy[0]][xy[1]]) {
    			lo = mid + 1;
    		} else {
    			return true;
    		}
    	}
    	
    	return false;
    }
    /*
    private int map(int i, int j, final int n) {
    	return i * n + j;
    }*/
    public int[] map(int idx, final int n) {
    	int[] idxs = {-1, -1};
    	idxs[0] = idx / n;
    	idxs[1] = idx % n;
    	
    	return idxs;
    }
    
	
} // end of class.
