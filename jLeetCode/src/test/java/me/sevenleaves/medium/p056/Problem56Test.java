/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p056;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem56Test extends TestCase {

	private Problem56 p = new Problem56();
	
	public void testMerge01() {
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(1,6));
		target.add(new Interval(8,10));
		target.add(new Interval(15,18));
		
		List<Interval> rs = p.merge(list);
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval a = rs.get(i);
			Interval b = target.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}
	
	public void testMerge02() {
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,4));
		list.add(new Interval(2,3));
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(1,4));
		
		List<Interval> rs = p.merge(list);
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval b = rs.get(i);
			Interval a = target.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}

} // end of class.
