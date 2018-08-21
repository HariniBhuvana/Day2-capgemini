package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.IncomeTaxProb;

class IncomeTaxTest {
	@Test
	void testFindTax() {
		assertEquals(540000, IncomeTaxProb.findTax(1800000));
	}
}
