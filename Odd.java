import java.util.*;
class Odd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to get sum of odd number in between");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
				sum+=i;
		}
		System.out.println("Sum of odd number is :" +sum);
	}
}