/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p278;

/**
 * @author Victor Young
 * @Todo: 278. First Bad Version
 *	Easy.
 *  https://leetcode.com/problems/first-bad-version/#/description.
 */
public class Problem278 {

	public int firstBadVersion (int n) {
		int lo = 1, hi = n, mid;
		
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			
			if (isBadVersion(mid)) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
	
	private boolean isBadVersion (int version) {
		return false;
	}
	
}
