import java.util.*;
class LargestNumber
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first number");
		int firstNumber=sc.nextInt();
		System.out.println("enter the second number");
		int secondNumber=sc.nextInt();
		System.out.println("enter the third number");
		int thirdNumber=sc.nextInt();
		
		
		
		if(firstNumber>secondNumber)
		{
			if(firstNumber>thirdNumber)
				System.out.println("largest number is "+firstNumber);
			else
				System.out.println("largest number is "+thirdNumber);
		}
		else
		{
			if(secondNumber>thirdNumber)
				System.out.println("largest number is "+secondNumber);
			else
				System.out.println("largest number is "+thirdNumber);
		}
	}
}