/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p074;

import junit.framework.TestCase;
import me.sevenleaves.medium.p074.Problem074;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem074Test extends TestCase {

	private Problem074 p = new Problem074();
	
	public final void testSearchMatrix01() {
		int[][] matrix = {{1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}};
		boolean actual = p.searchMatrix(matrix, 50);
		
		assertEquals(true, actual);
	}

} // end of class.
