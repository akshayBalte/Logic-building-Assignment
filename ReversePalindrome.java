import java.util.Scanner;

class ReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        
        int original = num, reversed = 0;
        while(num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        System.out.println("Reversed number: " + reversed);
        if(original == reversed)
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");
    }
}
