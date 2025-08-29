import java.util.*;
class PrintName
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		String[] array=new String[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("enter the name at "+i+" index  ");
			array[i]=sc.next();
		}
		
		System.out.print("Names in array is : ");
		for(String s : array)
			System.out.print(s+" ");
		
	}
}
	