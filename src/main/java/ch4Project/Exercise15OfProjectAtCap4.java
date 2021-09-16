package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise15OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        int count=0;
        while(num<=10){
            int result = (int) (Math.random() * 10) +1;
            System.out.println(result);
            count++;
            if(count==3){
                break;
            }

        }
    }
}
