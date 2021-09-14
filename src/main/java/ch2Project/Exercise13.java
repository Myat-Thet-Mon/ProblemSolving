package ch2Project;/*
BMR

 */

import java.util.Scanner;


public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pound and inches and year");
        double pound = input.nextDouble();
        double inches = input.nextDouble();
        double year = input.nextDouble();
        double female = 655 + (4.3 * pound) + (4.7 * inches) - (4.7 * year);
        double male = 66 + (6.3 * pound) + (12.9 * inches) - (6.8 * year);
        double BMRFemale = female / 230;
        double BMRMale = male / 230;
        System.out.println("Female " + BMRFemale);
        System.out.println("Male " + BMRMale);
    }
}
