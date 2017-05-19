/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p287;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem287Test extends TestCase {

	private Problem287 p = new Problem287();
	
	public final void testFindDuplicate01() {
		int[] nums = {1, 2, 3, 4, 4, 5};
		int rs = p.findDuplicate(nums);
		assertEquals(4, rs);
	}

}
