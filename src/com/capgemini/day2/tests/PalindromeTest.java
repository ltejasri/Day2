package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;
import com.capgemini.day2.Palindrome;

class PalindromeTest {

	@Test
	void testCheckPalindrome()
	
	{
		assertEquals(true,Palindrome.checkPalindrome(121));
	}

}
