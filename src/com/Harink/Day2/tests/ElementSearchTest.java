package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.ElementSearch;

class ElementSearchTest {
	@Test
	void testMissingNumber() {
		assertEquals(1, ElementSearch.missingNumber(new int[] {0,2,3}));
	}


}
