import java.util.Scanner;

class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 1000;        // first digit
        int d2 = (num / 100) % 10; // second digit
        int d3 = (num / 10) % 10;  // third digit
        int d4 = num % 10;         // fourth digit

        if (d1 + d2 == d3 + d4)
            System.out.println("Lucky number");
        else
            System.out.println("Not a lucky number");
    }
}
