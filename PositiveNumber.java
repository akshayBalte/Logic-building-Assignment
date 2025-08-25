import java.util.*;
class PositiveNumber
{
	public static void main(String[] arge)
	{	
		System.out.println("enter a number to check positive or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0)
		
			System.out.println("the given number "+ number + " is positive");
		else
			System.out.println("the given number "+ number +" is negative");
	}
}