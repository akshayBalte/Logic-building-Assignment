import java.util.*;

class Number
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number upto to print ");
		int number=sc.nextInt();
		System.out.println("the number is : ");
		for(int i=1;i<=number;i++)
		{
			System.out.print(i+" ");
		}
	}
}