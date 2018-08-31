package com.capgemini.day2;

public class Armstrong {

	public static boolean checkArmstrongNumber(int i) 
	{
		int n1,rem,res=0;
		n1=i;
		while(n1!=0)
		{
			rem=n1%10;
			res+=Math.pow(rem, 3);
			n1/=10;
		}
		if(res==i)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	

}
