/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p179;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem279Test extends TestCase {

	Problem279 p = new Problem279();
	
	/**
	 * Test method for {@link me.sevenleaves.easy.p179.Problem279#largestNumber(int[])}.
	 */
	public void testLargestNumber01() {
		int[] nums = {3, 30, 34, 5, 9};
		
		String actual = p.largestNumber(nums);
		
		assertEquals("9534330", actual);
	}
	
	public void testLargestNumber02() {
		int[] nums = {0, 0};
		
		String actual = p.largestNumber(nums);
		
		assertEquals("0", actual);
	}
	
	public void testLargestNumber03() {
		int[] nums = {824,938,1399,5607,6973,5703,9609,4398,8247};
		
		String actual = p.largestNumber(nums);
		
		assertEquals("9609938824824769735703560743981399", actual);
	}
	
	public void testLargestNumber04() {
		int[] nums = {12,121};
		
		String actual = p.largestNumber(nums);
		
		assertEquals("12121", actual);
	}
	
	public void testLargestNumber05() {
		int[] nums = {999999998,999999997,999999999};
		
		String actual = p.largestNumber(nums);
		
		assertEquals("999999999999999998999999997", actual);
	}
	
	

} // end of class.
