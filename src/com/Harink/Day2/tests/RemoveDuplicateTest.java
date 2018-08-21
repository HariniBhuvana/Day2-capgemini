package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.RemoveDuplicate;

class RemoveDuplicateTest {
	@Test
	void testRemoveDuplicate() {
		assertEquals("tha", RemoveDuplicate.removeDuplicate("thathathatha"));
	}
}
