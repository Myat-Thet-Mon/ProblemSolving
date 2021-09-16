package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise11OfProject {
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
        System.out.println("Enter F or M");
        String ans = input.next();
        if (ans.equalsIgnoreCase("F")) {
            System.out.println("Enter a or b or c or d");
            String result = input.next();
            if (result.equals("a")) {
                BMRFemale = BMRFemale * 20 / 100;
                System.out.println("Female " + BMRFemale);
            } else if (result.equals("b")) {
                BMRFemale = BMRFemale * 30 / 100;
                System.out.println("Female " + BMRFemale);
            } else if (result.equals("c")) {
                BMRFemale = BMRFemale * 40 / 100;
                System.out.println("Female " + BMRFemale);
            } else if (result.equals("d")) {
                BMRFemale = BMRFemale * 50 / 100;
                System.out.println("Female " + BMRFemale);
            }
        } else if(ans.equalsIgnoreCase("M")){
            System.out.println("Enter a or b or c or d");
            String result = input.next();
            if (result.equals("a")) {
                BMRMale = BMRMale * 20 / 100;
                System.out.println("Male " + BMRMale);
            } else if (result.equals("b")) {
                BMRMale = BMRMale * 30 / 100;
                System.out.println("Male " + BMRMale);
            } else if (result.equals("c")) {
                BMRMale = BMRMale * 40 / 100;
                System.out.println("Male " + BMRMale);
            } else if (result.equals("d")) {
                BMRMale = BMRMale * 50 / 100;
                System.out.println("Male " + BMRMale);
            }
        }
    }
}
