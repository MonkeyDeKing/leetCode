/**
 * @author Victor Young
 */
package me.sevenleaves.jsc.basic;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class IntToStringTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.jsc.basic.IntToString#intValueOf(java.lang.String)}.
	 */
	public void testIntValueOf1() throws Exception {
		assertEquals(IntToString.intValueOf("2147483647"), 2147483647);
	}
	public void testIntValueOf2() throws Exception {
		assertEquals(IntToString.intValueOf("-2147483648"), -2147483648);
	}
	public void testIntValueOf3() throws Exception {
		assertEquals(IntToString.intValueOf("0"), 0);
	}

	/**
	 * Test method for {@link me.sevenleaves.jsc.basic.IntToString#strValueOf(int)}.
	 */
	public void testStrValueOf1() {
		assertEquals(IntToString.strValueOf(2147483647), "2147483647");
	}
	public void testStrValueOf2() {
		assertEquals(IntToString.strValueOf(-2147483648), "-2147483648");
	}
	public void testStrValueOf3() {
		assertEquals(IntToString.strValueOf(0), "0");
	}

} // end of class.
