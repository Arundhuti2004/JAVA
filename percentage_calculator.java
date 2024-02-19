import java.util.Scanner;
public class percentage_calculator {
     static int subMarks = 500;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sub1");
        int sub1 = sc.nextInt();
        System.out.println("Enter the sub2");
        int sub2 = sc.nextInt();
        System.out.println("Enter the sub3");
        int sub3 = sc.nextInt();
        System.out.println("Enter the sub4");
        int sub4 = sc.nextInt();
        System.out.println("Enter the sub1");
        int sub5 = sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (totalMarks / 5.0) / subMarks * 100;
        System.out.println("percentage of the total marks:");
        System.out.println(percentage);
      
    }
    


}
