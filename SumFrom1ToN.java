import java.util.Scanner;

public class SumFrom1ToN {

    // Method to calculate sum from 1 to N
    public static int calculateSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;  // add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // Calling the method
        int result = calculateSum(N);

        // Displaying result
        System.out.println("The sum of numbers from 1 to " + N + " is: " + result);

        sc.close();
    }
}
