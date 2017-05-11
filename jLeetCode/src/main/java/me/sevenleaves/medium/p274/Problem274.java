/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p274;

import java.util.Arrays;

/**
 * @author Victor Young
 * @Todo: 274. H-Index
 * https://leetcode.com/problems/h-index/#/description
 * Medium
 */
public class Problem274 {

	public int hIndex(int[] citations) {
		int hIdx = 0, len = citations.length;
		
		Arrays.sort(citations);
		
		for (int i = 0; i < len; i++) {
			if ((len - i) <= citations[i]) {
				hIdx = len - i;
				break;
			}
		}
		
		return hIdx;
	}

} // end of class.
