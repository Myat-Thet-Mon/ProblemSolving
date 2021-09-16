package ch3.ch3Project;

import java.util.Scanner;

/*
Degrees _ C = 5(Degrees_F− 32)/9
Degrees_F = (9(Degrees_C)/5) + 32)
 */
public class Exercise5OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit F or Celsius C and number");
        String result = input.next();
        double num = input.nextDouble();
        if (result.equalsIgnoreCase("fahrenheit")) {
            double c = 5 * (num - 32) / 9;
            System.out.println("Celsius " + c);
        } else if (result.equalsIgnoreCase("celsius")) {
            double f = 9 * (num / 5) + 32;
            System.out.println("Fahrenheit " + f);
        } else if (result.equalsIgnoreCase("C") || result.equalsIgnoreCase("F")) {
            System.out.println("Error");
        }
    }
}
