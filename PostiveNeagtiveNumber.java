import java.util.*;

class PostiveNeagtiveNumber
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter "+i +"index of array ");
			array[i]=sc.nextInt();
		}
		
		int positveNumberCount=0;
		int negativeNumberCount=0;
		
		for(int i=0 ;i<size;i++)
		{
			if(array[i]>0)
				positveNumberCount++;
			else
				negativeNumberCount++;
		}
		System.out.println("postive number count: "+positveNumberCount+
							"\n negative number count : "+negativeNumberCount);

	}
}	