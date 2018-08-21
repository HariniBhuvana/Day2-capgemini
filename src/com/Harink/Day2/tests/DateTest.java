package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.Date;

class DateTest {
	@Test
		void testGetDate() {
			assertEquals("12/December/2018", Date.getDate("12,12,2018"));
			assertEquals("Wrong", Date.getDate("32,01,2018"));
		}

}
