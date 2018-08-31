package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrongrange;

class ArmstrongrangeTest {

	@Test
	void testfindAllArmstrongNumbers() {
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0}, Armstrongrange.findAllArmstrongNumbers(100, 1000)); 
	}
}


