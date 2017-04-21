/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class SortExampleTest extends TestCase {

	public void test () {
		Integer[] a = {1, 2, 3};
		
		SortExample.sort(a);
		
		SortExample.show(a);
		assertTrue(SortExample.isSorted(a));
	}
	
} // end of class.
