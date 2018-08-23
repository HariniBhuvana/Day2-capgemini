package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Harink.java.programs.PalindromeOfTenStrings;

class PalindromeOfTenStringsTest {

	PalindromeOfTenStrings tenPalidrom;

	@BeforeEach
	void setUp() {
		tenPalidrom = new PalindromeOfTenStrings(new String[] { "abcba", "cdadc", "ahdkjas", "sadhas", "ahdkjas", "sadhas",
				"ahdkjas", "sadhas", "ahdkjas", "sadhas", });
	}

	@AfterEach
	void tearDown() {
		tenPalidrom=null;
	}

	@Test
	void testCheckForPalindromandSetAlphabetically() {
		assertArrayEquals(new String[] { "aabbc", "accdd" },
				tenPalidrom.checkForPalindromandSetAlphabetically());
	}

}
