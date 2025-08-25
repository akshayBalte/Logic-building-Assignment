import java.util.*;

class Square
{
	public static void main(String[] args)
	{
		System.out.println("enter the side of square to get Area");
		Scanner sc =new Scanner(System.in);
		int side=sc.nextInt();
		
		int areaOfSquare=side*side;
		System.out.println("the Area of square is "+ areaOfSquare);
	}
}