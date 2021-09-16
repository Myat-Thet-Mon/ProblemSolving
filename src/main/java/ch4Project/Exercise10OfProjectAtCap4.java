package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise10OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double annually = 0;
        double monthly = 0;
        double daily = 0;
        double interest=0;
        System.out.println("Enter balance");
        double oriBalance = input.nextDouble();
        System.out.println("Enter interest rate");
        double rate = input.nextDouble();

        for (int i = 0; i < 10; i++) {
            interest = oriBalance * (rate / 100);
            oriBalance=oriBalance+interest;
            annually = oriBalance + interest * 1;
            monthly = oriBalance + interest * 12;
            daily = oriBalance + interest * 356;
        }
        System.out.println("annually total balance " + annually);
        System.out.println("monthly total balance " + monthly);
        System.out.println("daily total balance " + daily);
    }
}
