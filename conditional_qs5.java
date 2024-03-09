// Write a Java program to find whether a year entered by the user is a leap year or not
import java.util.Scanner;
public class conditional_qs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int year = sc.nextInt(); 
    if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
        System.out.println(year + " is a leap year");
    }
    else{
        System.out.println(year + " is a non leap year");
    }

    }

}
