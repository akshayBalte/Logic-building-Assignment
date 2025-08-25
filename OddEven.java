import java.util.*;

class OddEven
{
	public static void main(String[] Args)
	{
		System.out.println("enter a number to check odd or even");
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		
		if(number<=0)
			System.out.println("enter number greater than 0");
		else if(number%2==0)
				System.out.println("the given number "+number +" is even");
			else
				System.out.println("the given number "+number +" is odd");
			
	}
}
