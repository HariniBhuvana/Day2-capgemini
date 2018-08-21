package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.ReverseString;

class ReverseStringTest {

	@Test
	void testReverseString() {
		assertEquals("iniraH inimegpac ", ReverseString.reverseinput("Harini capgemini"));
		assertEquals("olleH droW ", ReverseString.reverseinput("Hello Word"));
	}

}
