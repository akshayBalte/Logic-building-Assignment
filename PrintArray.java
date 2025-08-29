import java.util.*;
class PrintArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("enter "+i +" index of array :  ");
			array[i]=sc.nextInt();
		}
		System.out.print("Array is :  ");
		
		
		for(int i:array)
			System.out.print(i+ " ");
		/*for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" " );
		}
		*/
	}
}