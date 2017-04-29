/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p242;

import java.util.Arrays;

/**
 * @author Victor Young
 * @Todo: Valid Anagram
 *        https://leetcode.com/problems/valid-anagram/#/description
 * @Tag: Sort
 */
public class Problem242 {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}

} // end of class.
