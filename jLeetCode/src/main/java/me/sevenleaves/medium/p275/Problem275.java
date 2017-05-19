/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p275;

/**
 * @author Victor Young
 * @Todo: 275. H-Index II.
 * Medium.
 * https://leetcode.com/problems/h-index-ii/#/description.
 */
public class Problem275 {

    public int hIndex(int[] citations) {
		int hIdx = 0, len = citations.length;
		
		for (int i = 0; i < len; i++) {
			if ((len - i) <= citations[i]) {
				hIdx = len - i;
				break;
			}
		}
		
		return hIdx;
	}
	
} // end of class.
