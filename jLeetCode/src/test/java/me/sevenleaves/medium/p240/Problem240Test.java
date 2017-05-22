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
		int[][] matrix = {{1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}};
		boolean actual = p.searchMatrix(matrix, 50);
		
		assertEquals(true, actual);
	}

} // end of class.
