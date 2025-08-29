import java.util.*;
class Even
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to get even number upto");
		int number =sc.nextInt();
		System.out.println("the even number is: ");
		for(int i=2;i<=number;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}