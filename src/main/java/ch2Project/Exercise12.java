package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius with inches");
        double radius = input.nextDouble();
        radius = radius * 0.004329;
        System.out.println("Enter height with feet");
        double height = input.nextDouble();
        height = height * 7.48;
        double cylinder = 3.14 * radius * radius * height;
        System.out.println("Number of gallons " + cylinder);

    }
}
