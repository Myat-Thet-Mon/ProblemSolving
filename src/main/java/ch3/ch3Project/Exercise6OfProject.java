package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise6OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter cent");
        int cent = input.nextInt();
        if (cent > 25 && cent < 100 && cent % 5 == 0) {
            int q = cent / 25;
            cent = cent % 25;
            int dime = cent / 10;
            cent = cent % 10;
            int nickel = cent / 5;
            cent = cent % 5;
            int penny = cent;
            System.out.println("Quarter " + q);
            System.out.println("Dime " + dime);
            System.out.println("Nickel " + nickel);
            System.out.println("Penny " + penny);
        } else {
            System.out.println("error");
        }
    }
}
