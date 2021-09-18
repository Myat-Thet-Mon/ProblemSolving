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
        double chocoFemale = 0;
        double chocoMale = 0;
        double BMRFemale = 655 + (4.3 * pound) + (4.7 * inches) - (4.7 * year);
        double BMRMale = 66 + (6.3 * pound) + (12.9 * inches) - (6.8 * year);

        System.out.println("Enter F or M");
        String ans = input.next();
        if (ans.equalsIgnoreCase("F")) {
            System.out.println("Enter a or b or c or d");
            String result = input.next();
            if (result.equals("a")) {
                BMRFemale = BMRFemale * 20 / 100;
                chocoFemale = BMRFemale / 230;
                System.out.println("Chocolate bars that can eat by female " + chocoFemale);
            } else if (result.equals("b")) {
                BMRFemale = BMRFemale * 30 / 100;
                chocoFemale = BMRFemale / 230;
                System.out.println("Chocolate bars that can eat by female " + chocoFemale);
            } else if (result.equals("c")) {
                BMRFemale = BMRFemale * 40 / 100;
                chocoFemale = BMRFemale / 230;
                System.out.println("Chocolate bars that can eat by female " + chocoFemale);
            } else if (result.equals("d")) {
                BMRFemale = BMRFemale * 50 / 100;
                chocoFemale = BMRFemale / 230;
                System.out.println("Chocolate bars that can eat by female " + chocoFemale);
            }
        } else if (ans.equalsIgnoreCase("M")) {
            System.out.println("Enter a or b or c or d");
            String result = input.next();
            if (result.equals("a")) {
                BMRMale = BMRMale * 20 / 100;
                chocoMale = BMRMale / 230;
                System.out.println("Chocolate bars that can eat by male " + BMRMale);
            } else if (result.equals("b")) {
                BMRMale = BMRMale * 30 / 100;
                chocoMale = BMRMale / 230;
                System.out.println("Chocolate bars that can eat by male " + BMRMale);
            } else if (result.equals("c")) {
                BMRMale = BMRMale * 40 / 100;
                chocoMale = BMRMale / 230;
                System.out.println("Chocolate bars that can eat by male " + BMRMale);
            } else if (result.equals("d")) {
                BMRMale = BMRMale * 50 / 100;
                chocoMale = BMRMale / 230;
                System.out.println("Chocolate bars that can eat by male " + BMRMale);
            }
        }
    }
}
