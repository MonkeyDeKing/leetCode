/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p069;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem69Test extends TestCase {

	private Problem69 p = new Problem69();
	
	public final void testMySqrt01() {
		assertEquals(0, p.mySqrt(0));
	}
	
	public final void testMySqrt02() {
		assertEquals(1, p.mySqrt(1));
	}
	
	public final void testMySqrt03() {
		assertEquals(2, p.mySqrt(4));
	}
	
	public final void testMySqrt04() {
		assertEquals(1, p.mySqrt(3));
	}
	
	public final void testMySqrt05() {
		assertEquals(4, p.mySqrt(17));
	}
	
	public final void testMySqrt06() {
		assertEquals(46340, p.mySqrt(2147483647));
	}

}
