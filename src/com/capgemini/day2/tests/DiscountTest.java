package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Discount;

class DiscountTest {

	@Test
	void test() 
	{
		assertEquals(65.0, Discount.bill(100,35));
	}

}
