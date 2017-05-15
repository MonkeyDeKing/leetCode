/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p436;

import junit.framework.TestCase;
import me.sevenleaves.medium.Interval;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem436Test extends TestCase {

	private Problem436 p = new Problem436();
	
	public final void testFindRightInterval01() {
		Interval[] intervals = new Interval[1];
		intervals[0] = new Interval(1, 2);
		
		int[] rs = p.findRightInterval(intervals);
		
		int[] exp = {-1};
		for (int i = 0; i < exp.length; i++) {
			assertEquals(exp[i], rs[i]);
		}
	}
	
	public final void testFindRightInterval02() {
		Interval[] intervals = new Interval[3];
		intervals[0] = new Interval(3, 4);
		intervals[1] = new Interval(2, 3);
		intervals[2] = new Interval(1, 2);
		
		int[] rs = p.findRightInterval(intervals);
		
		int[] exp = {-1, 0, 1};
		for (int i = 0; i < exp.length; i++) {
			assertEquals(exp[i], rs[i]);
			System.out.println(i);
		}
	}
	
	public final void testFindRightInterval03() {
		Interval[] intervals = new Interval[3];
		intervals[0] = new Interval(1, 4);
		intervals[1] = new Interval(2, 3);
		intervals[2] = new Interval(3, 4);
		
		int[] rs = p.findRightInterval(intervals);
		
		int[] exp = {-1, 2, -1};
		for (int i = 0; i < exp.length; i++) {
			assertEquals(exp[i], rs[i]);
		}
	}

}
