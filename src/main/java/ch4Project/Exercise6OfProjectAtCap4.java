package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise6OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String ans=null;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        int num=0;
        while(num>=0) {
            System.out.println("Enter number");
            num = input.nextInt();
            if (num >= 90 && num < 100) {
                a++;
            } else if (num >= 80 && num <= 89) {
                b++;
            } else if (num >= 70 && num <= 79) {
                c++;
            } else if (num >= 60 && num <= 69) {
                d++;
            } else if (num >= 0 && num <= 59) {
                f++;
            }
        }
        int totalGrade=a+b+c+d+f;
        System.out.println("TotalGrade "+totalGrade);
        System.out.println("A "+a);
        System.out.println("B "+b);
        System.out.println("C "+c);
        System.out.println("D "+d);
        System.out.println("F "+f);
    }
}
