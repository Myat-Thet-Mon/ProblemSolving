package ch4Project;

import java.util.Scanner;

/*
smallest
 */
public class Exercise5OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       double num=0;
        int count=0;
        double largest=0;
        double smallest=0;
        double sum=0;
        double average=0;
        while(num>=0) {
            System.out.println("enter num");
            num = input.nextDouble();
            if (num<0) {
                break;
            }
            if(num>largest){
                largest=num;
            }else{
                smallest=num;
            }
//           if (num > largest) {
//                largest = num;
//            } else {
//                largest = largest;
//            }
//
//            if (num <smallest) {
//                smallest=num;
//            }else{
//                smallest=num;
//            }

                count++;
            System.out.println("C "+count);
            sum =sum+num;
            System.out.println("S "+sum);

        }
        System.out.println("Largest number "+largest);
        System.out.println("Smallest number "+smallest);
        average=sum/count;
        System.out.println("Average "+average);
    }
}
