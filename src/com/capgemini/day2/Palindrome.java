package com.capgemini.day2;

public class Palindrome {

	public static boolean checkPalindrome(int i) 
	{
		{
			int num=121, ri=0, r, oi;
			oi = num;
			while( num != 0)
			{
				r = num % 10;
				ri = ri * 10 + r;
				num /= 10;
			}
			if(oi == ri)
				return true;
			else
				return false;

		}

	}

}
