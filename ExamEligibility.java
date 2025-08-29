import java.util.Scanner;

class ExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Classes held: ");
        int held = sc.nextInt();
        System.out.print("Classes attended: ");
        int attended = sc.nextInt();
        System.out.print("Medical cause (Y/N): ");
        char medical = sc.next().charAt(0);

        double percentage = (attended * 100.0) / held;

        if (percentage >= 75 || medical == 'Y' || medical == 'y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }
    }
}
