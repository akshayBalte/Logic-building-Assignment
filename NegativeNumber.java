import java.util.*;
class NegativeNumber
{
	public static void main(String[] arge)
	{	
		System.out.println("enter a number to check negative or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number<0)
		
			System.out.println("the given number "+ number + " is negative");
		else
			System.out.println("the given number "+ number +" is postive");
	}
}