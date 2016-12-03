/**
 * Complete a JUnit test case for RecursiveProbs.
 */

package Homework1.Lab12;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveProbsTest {

	@Test
	public void testRecursiveContainsWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertFalse(r.recursiveContains('a', s));
	}

	@Test
	public void testRecursiveContainsWithNoOccurrences() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertFalse(r.recursiveContains('z', s));
	}

	@Test
	public void testRecursiveContainsWithOccurrences() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertTrue(r.recursiveContains('a', s));
	}

	@Test
	public void testAllSameWithEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertTrue(r.recursiveAllCharactersSame(s));
	}

	@Test
	public void testAllSameWithDifferingCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertFalse(r.recursiveAllCharactersSame(s));
	}

	@Test
	public void testRecursiveAllSameWithAllSameCharacters() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "aaaaaaa";
		assertTrue(r.recursiveAllCharactersSame(s));
	}

	@Test
	public void testRecursiveReverseEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertEquals(s, "");
	}

	@Test
	public void testRecursiveReverseCheckWithDiff() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "hello";
		assertEquals(r.recursiveReverse(s), "olleh");
	}

	@Test
	public void testRecursiveReverseCheckWithSame() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "madam";
		assertEquals(r.recursiveReverse(s), "madam");
	}

	@Test
	public void testRecursiveCharactersCountEmptyString() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "";
		assertEquals(r.recursiveCount('a', s), 0);
	}

	@Test
	public void testRecursiveCharactersZeroCount() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertEquals(r.recursiveCount('z', s), 0);
	}

	@Test
	public void testRecursiveCharactersSomeCount() {
		RecursiveProbs r = new RecursiveProbs();
		String s = "The rain in Spain falls mainly on the plain.";
		assertEquals(r.recursiveCount('a', s), 5);
	}

}