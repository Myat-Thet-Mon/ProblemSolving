package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise16OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter value");
        int N= input.nextInt();
        int choco=N;
        System.out.println("We can eat "+N);
        int coupon=choco;
        System.out.println("We have "+coupon);

        int extraChoco=coupon/6;
        System.out.println("We can eat extra "+extraChoco);
    }
}
