package com.capgemini.day2;

public class Duplicate {

	public static Object findDuplicates(String word)
	{
		int len=word.length();
		char ch;
		String res=" ";
		for(int i=0;i<len;i++)
		{
			ch=word.charAt(i);
			if(ch!=' ')
			{
				res=res+ch;
				word=word.replace(ch, ' ');
			}
		}
		// TODO Auto-generated method stub
		return res;
	}

}
