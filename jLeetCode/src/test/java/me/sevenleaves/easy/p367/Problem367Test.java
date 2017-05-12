/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p367;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem367Test extends TestCase {

	private Problem367 p = new Problem367();
	
	public void testIsPerfectSquare01 () {
		int num = 16;
		
		boolean actual = p.isPerfectSquare(num);
		
		assertEquals(true, actual);
	}
	
	public void testIsPerfectSquare02 () {
		int num = 14;
		
		boolean actual = p.isPerfectSquare(num);
		
		assertEquals(false, actual);
	}
	
	public void testIsPerfectSquare03 () {
		int num = 0;
		
		boolean actual = p.isPerfectSquare(num);
		
		assertEquals(true, actual);
	}
	
	public void testIsPerfectSquare04 () {
		int num = 1;
		
		boolean actual = p.isPerfectSquare(num);
		
		assertEquals(true, actual);
	}
	public void testIsPerfectSquare05 () {
		int num = 808201;
		
		boolean actual = p.isPerfectSquare(num);
		
		assertEquals(true, actual);
	}
	
	
} // end of class.
