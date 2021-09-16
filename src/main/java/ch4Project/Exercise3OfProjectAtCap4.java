package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise3OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        double num = input.nextDouble();

        System.out.println("Enter Fahrenheit or Celsius");
        String result = input.next();
        do {
            if (result.equalsIgnoreCase("Fahrenheit")) {
                double c = 5 * (num - 32) / 9;
                System.out.println("Celsius " + c);
            } else if (result.equalsIgnoreCase("Celsius")) {
                double f = 9 * (num / 5) + 32;
                System.out.println("Fahrenheit " + f);
            } else if (result.equalsIgnoreCase("C") || result.equalsIgnoreCase("F")) {
                System.out.println("Enter valid temperature Fahrenheit or Celsius");
                result = input.next();
                if (result.equalsIgnoreCase("Fahrenheit")) {
                    double c = 5 * (num - 32) / 9;
                    System.out.println("Celsius " + c);
                } else if (result.equalsIgnoreCase("Celsius")) {
                    double f = 9 * (num / 5) + 32;
                    System.out.println("Fahrenheit " + f);

                }

            }
        } while (result.equalsIgnoreCase("Q"));

    }
}
