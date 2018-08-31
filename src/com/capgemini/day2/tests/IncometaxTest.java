package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Incometax;

class IncometaxTest {

	@Test
	void test()
	{
		assertEquals(22000, Incometax.cal(350000),0.2);
	}

}
