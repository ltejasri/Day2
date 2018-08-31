package com.capgemini.day2;

public class Interest {
	
	double si(int p,int t,int r)
	{
		double num;
		num=(double)(p*t*r)/100;
		System.out.println("Simple interest is:" + num);;
		return num;
	}
	double ci(int p,int t,int r)
	{
		double i;
		i=(double)p*Math.pow((1+r*0.01), t);
		i=(double)i-p;
		System.out.println("Compound interest is:" + i);
		return i;
	}

	public static double[] interest(int[] input) {
		double ar[]=new double[2];
		Interest i=new Interest();
		ar[0]=i.si(input[0], input[1], input[2]);
		ar[1]=i.ci(input[0], input[1], input[2]);
		// TODO Auto-generated method stub
		return ar;
	}

}
