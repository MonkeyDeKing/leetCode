/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p324;

import junit.framework.TestCase;
import me.sevenleaves.medium.p324.Problem324;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem324Test extends TestCase {

	private Problem324 p = new Problem324();
	
	/**
	 * Test method for {@link me.sevenleaves.medium.p324.Problem324#wiggleSort(int[])}.
	 */
	public void testWiggleSort01() {
		int[] nums = {1, 5, 1, 1, 6, 4};
		p.wiggleSort(nums );
	}
	public void testWiggleSort02() {
		int[] nums = {4, 5, 5, 6};
		p.wiggleSort(nums );
	}

} // end of class.
