/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p209;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem209Test extends TestCase {
	
	private Problem209 p = new Problem209();
	
	public final void testMinSubArrayLen01() {
		int s = 7;
		int nums[] = {2,3,1,2,4,3};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(2, actual);
	}
	
	public final void testMinSubArrayLen02() {
		int s = 3;
		int nums[] = {2,3,1,2,4,3};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(1, actual);
	}
	
	public final void testMinSubArrayLen03() {
		int s = 300;
		int nums[] = {2,3,1,2,4,3};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(0, actual);
	}
	
	public final void testMinSubArrayLen04() {
		int s = 15;
		int nums[] = {1,2,3,4,5};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(5, actual);
	}
	
	public final void testMinSubArrayLen05() {
		int s = 15;
		int nums[] = {15};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(1, actual);
	}
	
	public final void testMinSubArrayLen06() {
		int s = 15;
		int nums[] = {5};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(0, actual);
	}
	
	public final void testMinSubArrayLen07() {
		int s = 3;
		int nums[] = {1,1};
		
		int actual = p.minSubArrayLen(s, nums);
		
		assertEquals(0, actual);
	}

}
