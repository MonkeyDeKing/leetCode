/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p075;

import junit.framework.TestCase;
import me.sevenleaves.medium.p075.Problem075_v2;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem075Test extends TestCase {

	private Problem075_v2 p = new Problem075_v2();
	
	public void testSortColors() {
		int[] nums = {1, 0, 2, 0};
		
		p.sortColors(nums);
		
		for (int i : nums) 
			System.out.print(i + " ");
	}

} // end of class.
