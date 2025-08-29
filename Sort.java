import java.util.*;

class Sort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter "+i+"index of array: ");
			array[i]=sc.nextInt();
		}
			
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
			if(array[i]>array[j])
			{
				int demo=array[i];
				array[i]=array[j];
				array[j]=demo;
			}
			}
		}
		for(int i: array)
			System.out.print(i+" ");
		
	}
}
				
			






