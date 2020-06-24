import java.util.*;
public class Sumofalldigitsofagivennumber {
	public static void main(String args[])
	{
		Scanner vs=new Scanner(System.in);
		System.out.println("Enter the input number:");
		int num=vs.nextInt();
		int sum=0;
		String s=String.valueOf(num);
		for(int i=0;i<s.length();i++)
		{
			sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		System.out.println("The sum of all digits of given number is :"+sum);
	}

}
