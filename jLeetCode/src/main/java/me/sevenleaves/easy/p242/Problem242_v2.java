/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p242;

/**
 * @author Victor Young
 * @Todo: Valid Anagram
 *        https://leetcode.com/problems/valid-anagram/#/description
 * @Tag: Sort
 */
public class Problem242_v2 {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		
		final int SIZE = 128; // unicode 32 bits
		int[] map = new int[SIZE];
		for (char c : a) {
			map[(int) c]++;
		}
		
		int i;
		for (char c : b) {
			i = (int) c;
			map[i]--;
			
			if (map[i] < 0) {
				return false;
			}
		}
		
		return true;
	}

} // end of class.
