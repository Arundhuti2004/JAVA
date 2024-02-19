import java.util.*;

 public class input_1 {
    public static void main(String[] args) {
        System.out.println("Taking input in user");
        Scanner n1 = new Scanner(System.in);
        // Scanner n2 = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = n1.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = n1.nextInt();

        int sum = num1 + num2;
        System.out.print("The sum of num1 and num2 is : ");
        System.out.println(sum);



    }


    
}