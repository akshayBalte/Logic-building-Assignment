import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1–7): ");
        int day = sc.nextInt();

        String result;
        switch (day) {
            case 1: result = "Monday"; break;
            case 2: result = "Tuesday"; break;
            case 3: result = "Wednesday"; break;
            case 4: result = "Thursday"; break;
            case 5: result = "Friday"; break;
            case 6: result = "Saturday"; break;
            case 7: result = "Sunday"; break;
            default: result = "Invalid day number";
        }

        System.out.println("Day is " + result);
    }
}
