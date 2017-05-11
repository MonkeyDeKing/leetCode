/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p057;

import java.util.ArrayList;
import java.util.List;

import me.sevenleaves.medium.p056.Interval;

/**
 * @author Victor Young
 * @Todo: 57. Insert Interval
 *        https://leetcode.com/problems/insert-interval/#/description
 *        Medium.
 */
public class Problem57 {

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> rs = new ArrayList<Interval>(intervals.size());
		if (intervals == null || intervals.size() == 0) {
			rs.add(newInterval);
			return rs;
		}
		
		int idx = searchIdx (intervals, newInterval.start);
		
		int start = newInterval.start;
		int end = newInterval.end;
		
		int lo = 0;
		Interval cur;
		for ( ; lo <= idx; lo++) {
			cur = intervals.get(lo);
			
			if (cur.end >= start) {
				start = cur.start < start ? cur.start : start;
				break;
			}
		}
		
		for (int i = 0; i < lo; i++) {
			rs.add(intervals.get(i));
		}
		
		for ( ; idx < intervals.size(); idx++) {
			cur = intervals.get(idx);
			
			if (end >= cur.start) {
				if (cur.end > end) {
					end = cur.end;
				}
			} else {
				break;
			}
		}
		rs.add(new Interval(start, end));
		
		for (int i = idx; i < intervals.size(); i++) {
			rs.add(intervals.get(i));
		}
		
		return rs;
	}
	
	public int searchIdx (List<Interval> intervals, int start) {
		int lo = 0, hi = intervals.size();
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			int s = intervals.get(mid).start;
			if (mid == lo) {
				return mid;
			} else if (s == start) {
				return mid;
			} else if (s < start) {
				lo = mid;
			} else {
				hi = mid;
			}
		}
		
		return hi;
	}

} // end of class.
