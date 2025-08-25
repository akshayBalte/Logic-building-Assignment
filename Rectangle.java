import java.util.*;

class Rectangle
{
	public static void main(String[] args)
	{
		System.out.println("enter the length and height of rectangle to find area of it");
		Scanner sc =new Scanner(System.in);
		int length=sc.nextInt();
		int heigth = sc.nextInt();
		int area=length*heigth;
		System.out.println("area of rectangle is "+area);
	}
}