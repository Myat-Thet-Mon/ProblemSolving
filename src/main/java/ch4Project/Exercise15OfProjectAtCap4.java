package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise15OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        int equal=0;
        for(int i=0;i<3;i++){
            int result = (int) (Math.random() * num) +1;
            if(equal==result){
                System.out.println("It is in valid");
                System.exit(0);
            }
            equal+=result;

            System.out.println(result);
        }
    }
}
