import java.util.Scanner;

class GradeWithSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        if(marks >= 90)
            System.out.println("Grade: A+");
        else if(marks >= 80)
            System.out.println("Grade: A");
        else if(marks >= 75)
            System.out.println("Grade: A−");
        else if(marks >= 65)
            System.out.println("Grade: B+");
        else if(marks >= 50)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}
