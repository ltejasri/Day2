package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Missing;

class MissingTest {

	@Test
	void test()
	{
		assertEquals(2, Missing.find(new int[] {0,1,3,4,5},6));
	}

}
