/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Victor Young
 * @Todo: https://leetcode.com/problems/intersection-of-two-arrays-ii/#/description
 * Tag : Sort.
 */
public class Problem350 {

	public int[] intersection(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		
		int len1 = a.length, len2 = b.length;
		
		List<Integer> intersection = new ArrayList<Integer>(len1 < len2 ? len1 : len2);
		int i = 0, j = 0;
		while (i < len1 && j < len2) {
			if (a[i] == b[j]) {
				intersection.add(a[i]);
				i++;
				j++;
			} else if (a[i] < b[j]) {
				i++;
			} else {
				j++;
			}
		}
		
		int[] rs = new int[intersection.size()];
		for (i = 0; i < intersection.size(); i++) {
			rs[i] = intersection.get(i);
		}
		
		return rs;
	}
	
	
} // end of class.
