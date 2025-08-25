import java.util.*;
class Message
{
	public static void main ( String[] args)
	{
		System.out.println(" enter time to to print the message ");
		Scanner sc =new Scanner(System.in);
		int time=sc.nextInt();
		if(time>=5&&time<=12)
			System.out.println("Good Mornig");
		else
			System.out.println("not good Mornig");
	}
}