import java.util.*;
public class Primeornot {

	public static void main(String[] args) {
		Scanner vs=new Scanner(System.in);
		int num=vs.nextInt();
		int c=1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Is not a prime number");
				c=0;
				break;
			}
		}
		if(c==1)
			System.out.println("Is a prime number");

	}

}
