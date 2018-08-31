package com.capgemini.day2;

public class Incometax
{
	public static double cal(int income) {
		double tax = -1;
		int temp;
		if(income>0 && income<180000)
			System.out.println("nil");
			else if(income>181001 && income<300000)
			{
				temp=income;
				tax=(temp-180000)*0.1;
				System.out.println("Tax applicable is:" + tax);
			}
			else if(income>300001 && income<500000)
			{
				temp=income;
				tax=(temp-300000)*0.2+(120000*0.1);
				System.out.println("Tax apllicable is:" + tax);;
			}
			else if(income>500001 && income<1000000
					) {
				temp=income;
				tax=(temp-500000)*0.1+(120000*0.1)+(200000*0.2);
				System.out.println("Tax applicable is:" +tax);;
			}
			else
				System.out.println("enter a positive value");
		return tax;
					
	}
}
