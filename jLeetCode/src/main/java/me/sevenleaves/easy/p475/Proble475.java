/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p475;

import java.util.Arrays;

/**
 * @author Victor Young
 * @Todo: 475. Heaters
 *	https://leetcode.com/problems/heaters/#/description.
 *  Easy.
 */
public class Proble475 {

	public int findRadius (int[] houses, int[] heaters) {
		int max = 0, len = heaters.length;
		
		Arrays.sort(heaters);
		
		int idx, dis, dis2;
		for (int house : houses) {
			idx = searchInsert (heaters, house);
			
			if (idx == 0) {
				dis = heaters[0] - house;
			} else if (idx == len) {
				dis = house - heaters[len-1];
			} else {
				dis = heaters[idx] - house;
				dis2 = house - heaters[idx-1];
				dis = dis < dis2 ? dis : dis2;
			}
			
			max = dis > max ? dis : max;
		}
		
		
		return max;
	}
	
	public int searchInsert (int[] heaters, int target) {
		int lo = 0, hi = heaters.length-1, mid;
		
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			
			if (target < heaters[mid]) {
				hi = mid - 1;
			} else if (target > heaters[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return lo;
	}
	
}
