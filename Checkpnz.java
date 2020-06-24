package com.wipro.flowcontrolstatements;

public class Checkpnz 
{

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		if (a>0)
		{
		System.out.printf("%d is positive",a);
		}
		else if (a<0)
		{
		System.out.printf("%d is negative",a);
		}
		else
		{
		System.out.printf("%d is zero",a);
		}
		// TODO Auto-generated method stub

	}

}
