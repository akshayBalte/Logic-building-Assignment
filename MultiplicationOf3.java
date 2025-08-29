import java.util.*;
 class MultiplicationOf3
 {
	 public static void main(String[] args)
	 {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter a number upto print a multipication of 3");
		 int number=sc.nextInt();
		 
		 for(int i=3;i<=number;i+=3)
		 {
			 System.out.print(i+" ");
		 }
		 
		 
		/* for(int i=1;i<=number;i++)
		 {
			 int multiple=i*3;
			 if(multiple<=number)
				 System.out.print(multiple+" ");
			 else
				 break;
			 
		 }*/
	 }
 }