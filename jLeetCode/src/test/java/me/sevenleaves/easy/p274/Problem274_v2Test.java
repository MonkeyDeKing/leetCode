/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p274;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem274_v2Test extends TestCase {

	Problem274_v2 p = new Problem274_v2();
	
	/**
	 * Test method for {@link me.sevenleaves.easy.p274.Problem274#hIndex(int[])}.
	 */
	public void testHIndex01() {
		int[] citations = {3, 0, 6, 1, 5};
		
		int rs = p.hIndex(citations);
		
		assertEquals(3, rs);
	}
	
	public void testHIndex02() {
		int[] citations = {0};
		
		int rs = p.hIndex(citations);
		
		assertEquals(0, rs);
	}
	
	public void testHIndex03() {
		int[] citations = {100};
		
		int rs = p.hIndex(citations);
		
		assertEquals(1, rs);
	}
	
	public void testHIndex04() {
		int[] citations = {0, 1};
		
		int rs = p.hIndex(citations);
		
		assertEquals(1, rs);
	}
	
	public void testHIndex05() {
		int[] citations = {1, 2};
		
		int rs = p.hIndex(citations);
		
		assertEquals(1, rs);
	}
	
	public void testHIndex06() {
		int[] citations = {1, 1};
		
		int rs = p.hIndex(citations);
		
		assertEquals(1, rs);
	}

}
