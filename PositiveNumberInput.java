import java.util.Scanner;

public class PositiveNumberInput {

    // Method to repeatedly ask for a positive number
    public static void askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;

        // do-while ensures the loop runs at least once
        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        } while (number <= 0);  // keep asking until positive

        System.out.println("You entered a positive number: " + number);

        sc.close();
    }

    public static void main(String[] args) {
        askForPositiveNumber();
    }
}
