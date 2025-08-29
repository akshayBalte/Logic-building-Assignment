import java.util.*;
class SumOfArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("enter "+i+" index of array ");
			array[i]=sc.nextInt();
		}
		System.out.print("array is :  ");
		//for(int i:array)
			//System.out.print(i+"  ");
	
		int sum=0;
		for(int i : array)
			sum+=i;
		
		System.out.print("Sum of array is : "+sum);

	}
}
		