package com.wipro.flowcontrolstatements;

public class Integercharspecialcharacter 
{

	public static void main(String[] args) 
	{
		char ch = '*';
		if (((ch>=65)&&(ch<=95))||(ch>=97)&&(ch<=122))
		{
			System.out.println("ALPHABET");
		}
		else if ((ch>=48)&&(ch<=57))
		{
			System.out.println("DIGIT");
		}
		else
		{
			System.out.println("SPECIAL CHARACTER");
		}
		// TODO Auto-generated method stub

	}

}
