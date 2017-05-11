/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p274;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem274_v2 {

	public int hIndex(int[] citations) {
		int hIdx = 0, len = citations.length;
		
		int[] acc = new int[len+1];
		
		for (int citation : citations) {
			if (citation > len) {
				acc[len]++;
			} else {
				acc[citation]++;
			}
		}
		
		int account = 0;
		for (int i = len; i >= 0; i--) {
			account += acc[i];
			
			if (account >= i) {
				hIdx = i;
				break;
			}
		}
		
		return hIdx;
	}

} // end of class.
