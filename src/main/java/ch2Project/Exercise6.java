package ch2Project;

import java.util.Scanner;

/*
convert Fahrenheit to cersius
DegreesC = 5(DegreesF −32)/9
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Fahrenheit");
        double fahrenheit=input.nextDouble();
      double celsius=5*(fahrenheit-32)/9;
        System.out.println("celsius " +celsius);
    }
}
