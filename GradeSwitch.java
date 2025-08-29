import java.util.Scanner;

class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        String grade;
        switch (marks / 10) {
            case 10: case 9: case 8: grade = "A"; break;  // 85–100
            case 7: grade = "B"; break;                   // 70–84
            case 6: grade = "C"; break;                   // 55–69
            case 5: grade = "D"; break;                   // 45–54
            case 4: grade = "E"; break;                   // 25–44
            default: grade = "F";                         // 0–24
        }

        System.out.println("Grade: " + grade);
    }
}
