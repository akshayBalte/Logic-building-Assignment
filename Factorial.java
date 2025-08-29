import java.util.*;

class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number to find its factorial");
		int number =sc.nextInt();
		int factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial*=i;
		}
		System.out.println("factorial of a "+number+" is : "+factorial);
	}
}