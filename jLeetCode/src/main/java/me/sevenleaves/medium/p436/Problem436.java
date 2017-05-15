/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p436;

import java.util.Arrays;
import java.util.Comparator;

import me.sevenleaves.medium.Interval;

/**
 * @author Victor Young
 * @Todo: 436. Find Right Interval
 * https://leetcode.com/problems/find-right-interval/#/description.
 * Medium.
 */
public class Problem436 {

	public int[] findRightInterval (Interval[] intervals) {
		int len = intervals.length;
		int[] rs = new int[len];
		if (len == 1) {
			rs[0] = -1;
			return rs;
		}
		
		Integer[] idxs = new Integer[len];
		for (int i = 0; i < len; i++) {
			idxs[i] = i;
		}
		
		Arrays.sort(idxs, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return intervals[i1].start - intervals[i2].start;
			}
		});
		
		int end;
		for (int i = 0; i < len; i++) {
			end = intervals[idxs[i]].end;
			
			rs[idxs[i]] = searchInsert(end, intervals, idxs, i, len);
		}
		
		return rs;
	}
	
	public int searchInsert(int end, Interval[] intervals, Integer[] idxs, int i, int len) {
		int lo = i + 1;
		int hi = len - 1;
		
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			
			if (end < intervals[idxs[mid]].start) {
				hi = mid - 1;
			} else if (end > intervals[idxs[mid]].start) {
				lo = mid + 1;
			} else {
				return idxs[mid];
			}
		}
		
		if (lo == len)
			return -1;
		
		return idxs[lo];
	}
	
} // end of class.