public class EvenNumbersPrinter {

    // Method to print even numbers from 1 to 50
    public static void printEvenNumbers() {
        int i = 1;  // start from 1
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;  // increment the counter
        }
    }

    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 50:");
        printEvenNumbers();
    }
}
