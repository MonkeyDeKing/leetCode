/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p057;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import me.sevenleaves.medium.Interval;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem57Test extends TestCase {

	private Problem57 p = new Problem57();
	
	public void testInsert01() {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(6,9));
		
		Interval newInterval = new Interval(2,5);
		List<Interval> rs = p.insert(intervals, newInterval);
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(1,5));
		target.add(new Interval(6,9));
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval a = rs.get(i);
			Interval b = target.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}
	
	public void testInsert02() {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1,2));
		intervals.add(new Interval(3,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(12,16));
		
		Interval newInterval = new Interval(4,9);
		List<Interval> rs = p.insert(intervals, newInterval);
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(1,2));
		target.add(new Interval(3,10));
		target.add(new Interval(12,16));
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval a = rs.get(i);
			Interval b = target.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}
	
	public void testInsert03() {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1,5));
		
		Interval newInterval = new Interval(2,3);
		List<Interval> rs = p.insert(intervals, newInterval);
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(1,5));
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval a = target.get(i);
			Interval b = rs.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}
	
	public void testInsert04() {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(2,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(8,9));
		
		Interval newInterval = new Interval(0,1);
		List<Interval> rs = p.insert(intervals, newInterval);
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(0,1));
		target.add(new Interval(2,5));
		target.add(new Interval(6,7));
		target.add(new Interval(8,9));
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval a = target.get(i);
			Interval b = rs.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}
	
	public void testInsert05() {
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(7,9));
		
		Interval newInterval = new Interval(15,18);
		List<Interval> rs = p.insert(intervals, newInterval);
		
		List<Interval> target = new ArrayList<Interval>();
		target.add(new Interval(2,6));
		target.add(new Interval(7,9));
		target.add(new Interval(15,18));
		
		assertEquals(target.size(), rs.size());
		
		for (int i = 0; i < rs.size(); i++) {
			Interval a = target.get(i);
			Interval b = rs.get(i);
			
			assertEquals(a.start, b.start);
			assertEquals(a.end, b.end);
		}
	}

	public void testSearchIdx() {
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		
		int start = 15;
		
		int idx = p.searchIdx(list, start);
		assertEquals(3, idx);
		
	}

} // end of class.
