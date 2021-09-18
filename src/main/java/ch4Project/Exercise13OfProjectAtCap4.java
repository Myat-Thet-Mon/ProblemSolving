package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise13OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int num=input.nextInt();
        for (int i = 0; i < num/2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=num/2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
