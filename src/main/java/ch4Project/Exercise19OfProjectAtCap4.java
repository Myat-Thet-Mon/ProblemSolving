package ch4Project;

import javax.swing.*;
import java.awt.*;

/*

 */
public class Exercise19OfProjectAtCap4 extends JPanel {


    public void paintComponent(Graphics canvas) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter number of circle");
        int circle = input.nextInt();
        System.out.println("Enter first radius ");
        int radius = input.nextInt();
        int height=100;
        System.out.println("enter change radius");
        int radius2 = input.nextInt();
        System.out.println("Enter change x");
        int x = input.nextInt();
        */
        int circle=4;
        int radius=50;
        int height=100;
        int radius2=20;
        int x=100;
        int y=100;
        int x2=120;

        for (int i = 0; i < 5; i++) {
            if(i==0 ||i==3) {
                canvas.setColor(Color.RED);
            }
            else if(i==1||i==4){
                canvas.setColor(Color.GREEN);
            }else if(i==2 ){
                canvas.setColor(Color.BLUE);
            }
            canvas.drawOval(x, y, radius * 2, height);
                x = x + x2;
                radius = radius + radius2;

        }
    }
            public static void main (String[]args){
                Exercise19OfProjectAtCap4 panel = new Exercise19OfProjectAtCap4();
                JFrame frame = new JFrame();
                frame.setContentPane(panel);
                frame.setSize(600, 300);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        }
