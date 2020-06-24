package com.wipro.flowcontrolstatements;

public class Samelastdigit 
{

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = a%10;
		int y = b%10;
		if (x==y)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		// TODO Auto-generated method stub

	}

}