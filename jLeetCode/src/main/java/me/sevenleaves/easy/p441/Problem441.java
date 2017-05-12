/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p441;

/**
 * @author Victor Young
 * @Todo: 441. Arranging Coins
 * https://leetcode.com/problems/arranging-coins/#/description
 * 
 * Medium.
 */
public class Problem441 {

	public int arrangeCoins (int n) {
		return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
	}
	
} // end of class.
