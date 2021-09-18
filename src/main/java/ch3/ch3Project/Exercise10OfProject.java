package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise10OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pound and inches and year");
        double pound = input.nextDouble();
        double inches = input.nextDouble();
        double year = input.nextDouble();
        double BMRFemale = 655 + (4.3 * pound) + (4.7 * inches) - (4.7 * year);
        double BMRMale = 66 + (6.3 * pound) + (12.9 * inches) - (6.8 * year);
        double chocoFemale = BMRFemale / 230;
        double chocoMale = BMRMale / 230;
        System.out.println("Enter F or M");
        String ans = input.next();
        if (ans.equalsIgnoreCase("F")) {
            System.out.println("Female " + BMRFemale);

        } else if(ans.equalsIgnoreCase("F")){
            System.out.println("Male " + BMRMale);
        }

    }
}
