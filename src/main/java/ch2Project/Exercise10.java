package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter cent");
        int cent=input.nextInt();
        int quarter=cent/25;
        cent=cent%25;
        int dime=cent/10;
        cent=cent%10;
        int nickle=cent/5;
        System.out.println(quarter);
        System.out.println(dime);
        System.out.println(nickle);
    }
}
