import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num1 :");
    int sub1 = sc.nextInt();
    double sub1GradePoint = calculateGradePoint(sub1);
    System.out.println("Enter the num2 :");
    int sub2 = sc.nextInt();
    double sub2GradePoint = calculateGradePoint(sub2);
    System.out.println("Enter the num3 :");
    int sub3 = sc.nextInt();
    double sub3GradePoint = calculateGradePoint(sub3);
    double cgpa = (sub1GradePoint+ sub2GradePoint + sub3GradePoint)/3.0;
    System.out.println(cgpa);
    }
    private static double calculateGradePoint(int marks){
        if (marks >= 90) {
            return 4.0;
        } else if (marks >= 80) {
            return 3.0;
        } else if (marks >= 70) {
            return 2.0;
        } else if (marks >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }

    }
    
}

