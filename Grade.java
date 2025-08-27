import java.util.*;
class Grade
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the math ,science,history marks to get average and grade");
		int math=sc.nextInt();
		int science=sc.nextInt();
		int history=sc.nextInt();
		
		int average=(math+science+history)/3;
		if(average>=90)
			System.out.println("average mark = "+average+"\n Grade A"); 
		else if(average>=70&&average<=89)
			System.out.println("average mark = "+average+"\n Grade B"); 
		else if(average>=50&&average<=69)
			System.out.println("average mark = "+average+"\n Grade C"); 
		else if(average>=30&&average<=49)
			System.out.println("average mark = "+average+"\n Grade D"); 
		
		else
			System.out.println("average mark = "+average+"\n Grade F");

	}
}	