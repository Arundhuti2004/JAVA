// Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
import java .util. Scanner;
public class conditional_qs2 {
    public static void main(String[] args) {
        // float sub1,sub2,sub3;
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();


        float total_percentage = (sub1 + sub2 + sub3) / 3.0f;

        if(total_percentage >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33){
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed. Better luck next time.");
        }
        





    }
}
