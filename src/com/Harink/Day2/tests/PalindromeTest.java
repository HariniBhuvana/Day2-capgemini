package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.Palindrome;

class PalindromeTest {

	@Test
	void testPalindromCheck() {
		assertEquals(true, Palindrome.palindromCheck(121));
		assertEquals(false, Palindrome.palindromCheck(256));
	}

}
