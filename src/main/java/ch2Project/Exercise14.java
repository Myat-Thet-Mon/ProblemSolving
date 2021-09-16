package ch2Project;

import javax.swing.*;

/*

 */
public class Exercise14 extends JFrame {
     public static void main(String[] args) {
         String input=JOptionPane.showInputDialog("Enter weight in pound");
         int pound=Integer.parseInt(input);
         input=JOptionPane.showInputDialog("Enter height in inches");
         int height=Integer.parseInt(input);
         input=JOptionPane.showInputDialog("Enter age in year");
         int age=Integer.parseInt(input);
         double female = 655 + (4.3 * pound) + (4.7 * height) - (4.7 * age);
         double male = 66 + (6.3 * pound) + (12.9 * height) - (6.8 * age);
         double BMRFemale = female / 230;
         double BMRMale = male / 230;
         JOptionPane.showMessageDialog(null,"Female "+BMRFemale);
         JOptionPane.showMessageDialog(null,"Male "+BMRMale);

     }
}
