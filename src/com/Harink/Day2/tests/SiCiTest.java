package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Harink.java.programs.SiCi;

class SiCiTest {

   SiCi interest;

	@BeforeEach
	void setUp() {
		interest = new SiCi(100, 3.2, 2);
	}

	@Test
	void testSimpleInterest() {
		assertEquals(6.4, interest.simpleInterest());
	}

	@Test
	void testCompoundInterest() {
		assertEquals(106.5, interest.compoundInterest(), 0.5);
	}

	@AfterEach
	void tearDown() {
		interest = null;
	}

}
