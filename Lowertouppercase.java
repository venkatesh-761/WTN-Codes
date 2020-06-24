import java.util.*;
public class Lowertouppercase {
	public static void main(String args[])
	{
		Scanner vs=new Scanner(System.in);
		char ch=vs.next().charAt(0);
		if(Character.isUpperCase(ch))
		    System.out.println(Character.toLowerCase(ch));
		else
			System.out.println(Character.toUpperCase(ch));
			
	}
}
