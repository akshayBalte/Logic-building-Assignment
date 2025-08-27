import java.util.Scanner;

public class SumOfNumbers {

    // Method to calculate sum of two numbers
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calling the method
        int sum = sumOfTwoNumbers(num1, num2);

        // Displaying result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        
        sc.close();
    }
}
