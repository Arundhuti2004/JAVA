import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        System.out.println("Enter your km value : ");
    Scanner sc =  new Scanner(System.in);
    double km = sc.nextDouble();
    double m = km * 1000;
    System.out.println(m);
    }

}
