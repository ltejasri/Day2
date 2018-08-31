package com.capgemini.day2;

public class Stringofpal
{
String rev(String r)
	
	{
		String re="";
		for(int i=r.length()-1;i>=0;i--)
		{
			re=re+r.charAt(i);
		}
		return re;
	}
public static String[] OrderPalindromes(String[] str) {
	Stringofpal st = new Stringofpal();
	String pal[] = new String[10];
	String str2="";
	int j=0;
	for(int i = 0; i < str.length; i++)
	{
		str2 = st.rev(str[i]);
		if(str[i].equals(str2))
		{
			pal[j] = str[i];
			j++;
		}
	}
	System.out.println("Number of palindromes are : "+j);;
	for(int i = 0; i < j-1; i++)
	{
		for(int x=0; x<j-1; x++) {
		if(pal[x].length()<pal[x+1].length()) {
			String temp = pal[x+1];
			pal[x+1]=pal[x];
			pal[x]=temp;
		}
		}
	}
	for(int i = 0; i < j; i++)
	{
		System.out.println(pal[i]+" ");
	}
	return pal;
}

}
