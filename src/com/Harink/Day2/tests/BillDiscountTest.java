package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.DiscountBill;

class BillDiscountTest {

	@Test
	void testBillDetails() {
		assertEquals(65, DiscountBill.billDetails(100));

}
}
