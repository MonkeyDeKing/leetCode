/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p240;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem240Test extends TestCase {

	private Problem240 p = new Problem240();
	
	public final void testSearchMatrix01() {
		int[][] matrix = {
		                  {1,   4,  7, 11, 15},
		                  {2,   5,  8, 12, 19},
		                  {3,   6,  9, 16, 22},
		                  {10, 13, 14, 17, 24},
		                  {18, 21, 23, 26, 30}
		                  };
		
		boolean actual = p.searchMatrix(matrix, 5);
		
		assertEquals(true, actual);
	}
	
	public final void testSearchMatrix02() {
		int[][] matrix = {
				{1,   4,  7, 11, 15},
				{2,   5,  8, 12, 19},
				{3,   6,  9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}
		};
		
		boolean actual = p.searchMatrix(matrix, 20);
		
		assertEquals(false, actual);
	}

}
