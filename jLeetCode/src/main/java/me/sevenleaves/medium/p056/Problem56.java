/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p056;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Young
 * @Todo: 56. Merge Intervals
 *  https://leetcode.com/problems/merge-intervals/#/description
 *  Medium
 */
public class Problem56 {

	public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2)
        	return intervals;
        
        // sort
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
		
        List<Interval> rs = new ArrayList<Interval>();
        Interval cur = intervals.get(0);
        int start = cur.start, end = cur.end;
        for (int i = 1; i < intervals.size(); i++) {
        	Interval t = intervals.get(i);
        	
        	if (t.start <= end) {
        		end = t.end > end ? t.end : end;
        	} else {
        		rs.add(new Interval(start, end));
        		start = t.start;
        		end = t.end;
        	}
        }
        int lastEnd = intervals.get(intervals.size()-1).end;
        rs.add(new Interval(start, lastEnd > end ? lastEnd : end));
        
		return rs;
    }
	
} // end of class.
