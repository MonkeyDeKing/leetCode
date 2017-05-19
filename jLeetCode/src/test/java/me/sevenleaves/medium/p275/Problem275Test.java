/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p275;

import junit.framework.TestCase;

public class Problem275Test extends TestCase {

	Problem275 p = new Problem275();

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
