/**
 * @author Victor Young
 */
package me.sevenleaves.jsc.basic;

/**
 * @author Victor Young
 * @Todo: Convert one integer to string type, or convert one string to integer type.
 *
 */
public class IntToString {

	/**
	 * Convert a string value to a integer.
	 * @throws Exception 
	 */
	public static int intValueOf (String str) throws Exception {
		char[] chars = str.toCharArray();
		if (chars.length == 0) {
			throw new Exception("This is not a number.");
		}
		
		int value, i = 0;
		value = charToInt (chars[i++]);
		
		if (chars.length > 1 && value < 0) {
			value = 0 - charToInt (chars[i++]);
		}
		
		for ( ; i < chars.length; i++) {
			if (value < 0) {
				value = value * 10 - charToInt (chars[i]);
			} else {
				value = value * 10 + charToInt (chars[i]);
			}
		}
		
		return value;
	}
	
	private static int charToInt (char c) throws Exception {
		int t;
		switch (c) {
		case '-': t = -1;
			break;
		case '0': t = 0;
			break;
		case '1': t = 1;
			break;
		case '2': t = 2;
			break;
		case '3': t = 3;
			break;
		case '4': t = 4;
			break;
		case '5': t = 5;
			break;
		case '6': t = 6;
			break;
		case '7': t = 7;
			break;
		case '8': t = 8;
			break;
		case '9': t = 9;
			break;
		default:
			throw new Exception("This is not a number.");
		}
		
		return t;
	}
	
	/**
	 * Convert a integer value to a string.
	 */
	public static String strValueOf (int i) {
		StringBuilder sb = new StringBuilder("");
		
		boolean isNegative = false;
		if (i < 0) {
			isNegative = true;
		}
		
		if (i == 0) {
			sb.append("0");
		}
		
		int t;
		while (i != 0) {
			t = i % 10;
			if (t < 0) {
				t = -t;
			}
			
			sb.append(t);
			
			i = i / 10;
		}
		
		if (isNegative) {
			sb.append("-");
		}
		
		return sb.reverse().toString();
	}
	
} // end of class.
