// Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
import java.util.Scanner;
public class text {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name  = sc.next();
        System.out.println("Hello " + name + ", have a good day .");
    }
    
}
