import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if ("aeiouAEIOU".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Error: Invalid input");
        }
    }
}
