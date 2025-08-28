import java.util.Scanner;

public class MultiplicationTable {

    // Method to print multiplication table
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calling the method
        printMultiplicationTable(num);

        sc.close();
    }
}
