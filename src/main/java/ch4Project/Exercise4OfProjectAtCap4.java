package ch4Project;

import javax.swing.*;
import java.util.Scanner;

/*

 */
public class Exercise4OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = null;
        do {
            String num1 = JOptionPane.showInputDialog("Enter numbers");
            int num = Integer.parseInt(num1);
            String ans = JOptionPane.showInputDialog("Enter temperature");

            if (ans.equalsIgnoreCase("f") || ans.equalsIgnoreCase("c")) {
                JOptionPane.showMessageDialog(null, "Error");
                String valid = JOptionPane.showInputDialog("Enter valid temperature fahrenheit or celsius");
                if (valid.equalsIgnoreCase("fahrenheit")) {
                    double f = 9 * (num / 5) + 32;
                    JOptionPane.showMessageDialog(null, "Fahrenheit" + f);

                } else if (valid.equalsIgnoreCase("celsius")) {
                    double c = 5 * (num - 32) / 9;
                    JOptionPane.showMessageDialog(null, "Celsius" + c);
                }
                result = JOptionPane.showInputDialog("Do you want to continue yes or no");
            } else {
                JOptionPane.showMessageDialog(null, "error");
            }
        } while (result.equalsIgnoreCase("yes"));
    }
}
