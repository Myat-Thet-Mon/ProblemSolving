package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise11OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cent = 0;
        while (cent >= 0) {
            System.out.println("Enter cent");
            cent = input.nextInt();
            if (cent >= 25 && cent <= 100 &&cent/5==0 ) {
                    cent=100-cent;
                    int quarter = cent / 25;
                    cent = cent % 25;
                    int dime = cent / 10;
                    cent = cent % 10;
                    int nickel = cent / 5;
                    System.out.println(quarter);
                    System.out.println(dime);
                    System.out.println(nickel);

            } else {
                System.out.println("error");
                break;
            }
        }
    }
}
