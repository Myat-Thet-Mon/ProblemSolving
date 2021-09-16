package ch4Project;

import javax.swing.*;

/*

 */
public class Exercise12OfProjectAtCap4 {
    public static void main(String[] args) {
        String line= JOptionPane.showInputDialog("Enter profane");
        if(line.equalsIgnoreCase("Dog")||line.equalsIgnoreCase("Cat") ||line.equalsIgnoreCase("llama")){
            JOptionPane.showMessageDialog(null,"profane");
        }else{
            JOptionPane.showMessageDialog(null,"It not profane");
        }
    }
}
