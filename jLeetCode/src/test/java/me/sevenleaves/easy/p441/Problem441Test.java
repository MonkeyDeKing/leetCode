/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p441;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem441Test extends TestCase {

	private Problem441 p = new Problem441();
	
	public void testArrangeCoins01() {
		assertEquals(0, p.arrangeCoins(0));
	}
	
	public void testArrangeCoins02() {
		assertEquals(1, p.arrangeCoins(1));
	}
	
	public void testArrangeCoins03() {
		assertEquals(2, p.arrangeCoins(5));
	}
	
	public void testArrangeCoins04() {
		assertEquals(3, p.arrangeCoins(8));
	}
	
	public void testArrangeCoins05() {
		assertEquals(60070, p.arrangeCoins(1804289383));
	}

} // end of class.
