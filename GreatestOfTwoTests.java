import java.util.Scanner;

public class GreatestOfTwoTests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score for Test 1: ");
        int test1 = sc.nextInt();
        System.out.print("Enter score for Test 2: ");
        int test2 = sc.nextInt();

        if (test1 > test2) {
            System.out.println("Test 1 has higher score.");
        } else if (test2 > test1) {
            System.out.println("Test 2 has higher score.");
        } else {
            System.out.println("Both tests have equal scores.");
        }
    }
}
