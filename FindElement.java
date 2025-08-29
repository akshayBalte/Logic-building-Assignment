import java.util.*;
class FindElement
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter "+i+"index of array: ");
			array[i]=sc.nextInt();
		}
		
		System.out.println("enter the number to find in array or not");
		int searchNumber=sc.nextInt();
		
		boolean found=false;
		int index=-1;
		
		for(int i=0;i<size;i++)
		{
			if(searchNumber==array[i])
			{	
				found=true;
				index=i;
				break;
			}
			
		}
		if(found)
			System.out.println("the element "+searchNumber+" is found at index :"+index);
		else
			System.out.println(" element is not found");
	}
}