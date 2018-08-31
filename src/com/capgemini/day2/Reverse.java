package com.capgemini.day2;



public class Reverse {

	public static String findAllReverse(String string)
	{
		
		String ans = "";
		String str2[]=string.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			String rev="";
			for(int j=str2[i].length()-1;j>=0;j--)
			{
				rev=rev+str2[i].charAt(j);
			}
			ans=ans+rev+" ";
		}
		
		return ans;
	}
}


	