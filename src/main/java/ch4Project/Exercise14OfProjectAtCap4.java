package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise14OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int initialVelocity=100;
        int velocity=100;
        int height=0;
        int newHeight=0;
        int j=0;
        System.out.println("Time "+j+":"+"Height :"+"0");
        for(int i=0;i<5;i++){
            height=height+initialVelocity-32*(i);
           j++;
          //   velocity=height;
            System.out.println("Time "+j+":"+"Height :"+height);
        }

    }
}
