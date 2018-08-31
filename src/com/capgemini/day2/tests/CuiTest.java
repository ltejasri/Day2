package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Cui;

class CuiTest {

	@Test
	void testCui() 
	{
		assertEquals(1,Cui.checkId("Tejasri", "12345", "Tejasri", "12345"));
	}

}
