import java.util.*;

class Leaf
{
	public static void main(String[] args)
	{
		System.out.println("enter a year to check leaf or not");
		Scanner sc =new Scanner(System.in);
		int year=sc.nextInt();
		
		if(year%4 ==0 && year%100!=0)
			System.out.println("year is leaf "+year);
		else if(year % 400==0)
				System.out.println("year is leaf "+year);
		else
			System.out.println("year is  not leaf "+year);
	}
}

