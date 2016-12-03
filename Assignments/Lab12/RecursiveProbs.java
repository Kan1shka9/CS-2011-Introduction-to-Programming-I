/**
 * Write the class RecursiveProbs, with the methods listed below. Write all the methods using recursion, not loops. 
 * You may use JDK String methods like substring() and length(), but do not use the JDK methods to avoid coding the algorithms assigned. 
 * For example, don't use String.reverse().
 */

package Homework1.Lab12;

public class RecursiveProbs {

	public boolean recursiveContains(char c, String s) {
		if (s.length() == 0) {
			return false;
		}
		if (s.charAt(s.length() - 1) == c) {
			return true;
		} else {
			return recursiveContains(c, s.substring(0, s.length() - 1));
		}

	}

	public boolean recursiveAllCharactersSame(String s) {
		if (s.length() <= 1) {
			return true;
		}

		else if (s.charAt(0) != s.charAt(1)) {
			return false;
		}

		else {
			return recursiveAllCharactersSame(s.substring(1));
		}
	}

	public String recursiveReverse(String s) {
		if ((s == null) || (s.length() <= 1)) {
			return s;
		}
		return recursiveReverse(s.substring(1)) + s.charAt(0);

	}

	public int recursiveCount(char c, String s) {

		int count = 0;
		if (s.length() == 0) {
			return 0;
		}
		if (s.charAt(0) == c) {
			count = 1 + recursiveCount(c, s.substring(1));
			return count;
		}
		return recursiveCount(c, s.substring(1));
	}

}