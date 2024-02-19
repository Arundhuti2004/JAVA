// Write the following expression in a java program:
// (v^2-u^2)/2as
import java.util.Scanner;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the final velocity (v): ");
        double v =sc.nextDouble();

        System.out.print("Enter the initial velocity (u): ");
        double u = sc.nextDouble();

        System.out.print("Enter the acceleration (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the displacement (s): ");
        double s = sc.nextDouble();

        double result = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);

        System.out.println("Result: " + result);

        
    }
}
