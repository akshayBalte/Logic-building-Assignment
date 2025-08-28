import java.util.Scanner;

public class MenuDrivenProgram {

    // Problem 1: Grade Evaluation System
    public static void gradeEvaluation(int marks) {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    // Problem 2: Leap Year Check
    public static void leapYearCheck(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    // Problem 3: Day of the week
    public static void dayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1: System.out.println("The day is Monday."); break;
            case 2: System.out.println("The day is Tuesday."); break;
            case 3: System.out.println("The day is Wednesday."); break;
            case 4: System.out.println("The day is Thursday."); break;
            case 5: System.out.println("The day is Friday."); break;
            case 6: System.out.println("The day is Saturday."); break;
            case 7: System.out.println("The day is Sunday."); break;
            default: System.out.println("Invalid day number.");
        }
    }

    // Problem 4: Identify Default Values of Variables
    static int intVar;
    static double doubleVar;
    static boolean boolVar;
    static char charVar;
    static String strVar;

    public static void displayDefaultValues() {
        System.out.println("Default int value: " + intVar);
        System.out.println("Default double value: " + doubleVar);
        System.out
