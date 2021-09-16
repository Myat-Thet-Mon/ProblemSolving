package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise1OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number and second number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 / num2 == 0 || num2/num1==0) {
            System.out.println(num1 + "\n" + num2);
        }
    }
}
