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
public class ShellSortTest extends TestCase {

	public void testSort () {
		
		Double[] a = SortCompare.randomInput(1000);
		
		ShellSort shell = new ShellSort();
		shell.sort(a);
		
		assertTrue(shell.isSorted(a));
	}
	
} // end of class.
