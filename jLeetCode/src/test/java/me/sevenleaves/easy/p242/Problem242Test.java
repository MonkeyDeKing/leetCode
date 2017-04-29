/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p242;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: Valid Anagram
 *        https://leetcode.com/problems/valid-anagram/#/description
 * @Tag: Sort
 */
public class Problem242Test extends TestCase {

	public void testIsAnagram01() {
		String s = "anagram", t = "nagaram";
		
		boolean actual = new Problem242().isAnagram(s, t);
		
		assertEquals(true, actual);
	}

	public void testIsAnagram02() {
		String s = "rat", t = "car";
		
		boolean actual = new Problem242().isAnagram(s, t);
		
		assertEquals(false, actual);
	}
}
