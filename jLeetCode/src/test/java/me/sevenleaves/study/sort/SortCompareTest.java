/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import junit.framework.TestCase;
import me.sevenleaves.study.sort.SortCompare.SortAlg;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class SortCompareTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.study.sort.SortCompare#time(java.lang.String, java.lang.Double[])}.
	 */
	public void testTime() {
		Integer[] a = {3, 5, 7, 2, 9, 1, 6};
		
		long time = SortCompare.time(SortAlg.Insertion, a);
		
		System.out.println(time);
		
	}
	
	public void testTiemRandomInput() {
		long total = SortCompare.timeRandomInput(SortAlg.Insertion, 1000, 100);
		System.out.println(total
				);
	}

} // end of class.
