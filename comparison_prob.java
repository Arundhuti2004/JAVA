// Use comparison operators to find out whether a given number is greater than the user entered number or not.
import java.util.Scanner;
public class comparison_prob {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 8){
            System.out.println("User entered number is greater");
        }
        else{
            System.out.println("User entered number is smaller");
        }
    }
}
