/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p050;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem50Test extends TestCase {

	private Problem50_v2 p = new Problem50_v2();
	
	public final void testMyPow01() {
		assertEquals(1024.0, p.myPow(2, 10));
	}

}
