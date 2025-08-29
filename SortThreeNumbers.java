import java.util.Scanner;
import java.util.Arrays;

class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        
        System.out.print("Enter first number: ");
        arr[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        arr[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        arr[2] = sc.nextInt();
        
        Arrays.sort(arr);
        System.out.println("Ascending order: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
