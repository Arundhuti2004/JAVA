// Calculate income tax paid by an employee to the government as per the slabs mentioned below:

// Income Slab	Tax
// 2.5L – 5.0L  	5%
// 5.0L – 10.0L 	20%
// Above 10.0L	30%
import java.util.Scanner;
public class conditional_qs3 {
    public static void main(String[] args) {
        float tax = 0;

        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();

        if(income <= 250000){
            tax = tax + 0;
            System.out.println(tax);
        }
        else if(income >= 2.50000 && income <= 500000){
            tax = tax + 0.05f * (income - 250000);
            System.out.println(tax);
        }
        else if(income >= 500000 && income <= 1000000){
            tax = tax + 0.05f * (income - 250000) + 0.2f * (income - 500000);
            System.out.println(tax);
        }
        else{
            tax = tax + 0.05f * (income - 250000) + 0.2f * (income - 500000) + 0.3f * (income - 1000000);
            System.out.println(tax);
        }


    }
    
}
