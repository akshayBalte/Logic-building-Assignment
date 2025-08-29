import java.util.*;
class LargestElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("enter "+i+" index element :  ");
			array[i]=sc.nextInt();
		}
		
		System.out.print("Array is : " );
		for(int i:array)
			System.out.print(i+" ");
		
		int largest=array[0];
		
		System.out.println(" ");
		for(int i=0;i<size;i++)
		{
			if(largest<array[i])
				largest=array[i];
		}
		
		System.out.println("largest element in array is "+largest);
		
		
	}
}