package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Interest;

class InterestTest {

	@Test
	void test()
	{
		assertArrayEquals(new double[] {240,484008},Interest.interest(new int[] {20,30,40}),1);
	}

}
