package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise14OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial velocity");
        int initialVelocity = input.nextInt();
        int height = 0;
        int newHeight = 0;
        int j = 0;
        System.out.println("Time " + j + ":" + "Height :" + height);
        for (int i = 0; i < 5; i++) {
            newHeight += initialVelocity - 32 * (i);

            if (newHeight < 0) {
                newHeight=newHeight*((int)-0.5);
                initialVelocity=initialVelocity*((int)-0.5);
               newHeight+= initialVelocity - 32 * (i);
            }
            j++;
            System.out.println("Time " + j + ":" + "Height :" + newHeight);
        }

    }
}
