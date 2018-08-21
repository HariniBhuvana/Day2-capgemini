package com.Harink.java.programs;

public class DiscountBill {
	public static double billDetails(double newItem) {
		double discount = (double) (newItem * 0.35);
		double newItemPrice = newItem - discount;
		return newItemPrice;
	}

}
