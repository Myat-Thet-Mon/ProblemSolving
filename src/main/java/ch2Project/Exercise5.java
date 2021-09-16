package ch2Project;

import java.util.Scanner;

/*
read int to string
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer");
        int num1=input.nextInt();
        System.out.println("Enter integer");
        int num2=input.nextInt();
        System.out.println("Enter integer");
        int num3=input.nextInt();
        System.out.println("Enter integer");
        int num4=input.nextInt();
        String a=String.valueOf(num1);
        String b=String.valueOf(num2);
        String c=String.valueOf(num3);
        String d=String.valueOf(num4);
        System.out.println(a+b+c+d);

    }
}
