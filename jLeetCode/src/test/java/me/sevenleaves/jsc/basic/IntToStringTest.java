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
	public void testIntValueOf4() throws Exception {
		assertEquals(IntToString.intValueOf("-123"), -123);
	}
	public void testIntValueOf5() throws Exception {
		assertEquals(IntToString.intValueOf("321"), 321);
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
	public void testStrValueOf4() {
		assertEquals(IntToString.strValueOf(-123), "-123");
	}
	public void testStrValueOf5() {
		assertEquals(IntToString.strValueOf(321), "321");
	}

} // end of class.
