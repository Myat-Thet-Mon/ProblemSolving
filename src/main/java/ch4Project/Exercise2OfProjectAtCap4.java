package ch4Project;

import java.util.Scanner;

/*three non negative numbers
Display the integers in increasing order.
Write a program that implements your algorithm from Exercise 2.
 */
public class Exercise2OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number and second number and third number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

       if(num1>0 && num2>0 && num3>0) {
           if (num1 > num2) {
                if(num1>num3){
                    if(num2>num3){
                        System.out.println(num2);
                    }else if(num2==num3){
                        System.out.println(num2);//two
                    }else if(num2<num3){
                        System.out.println(num3);
                    }
                }else if(num1==num3){
                    System.out.println(num1);//two

                }else if(num1<num3){
                    System.out.println(num1);
                }
           }else if(num2>num1){
               if (num2 > num3) {
                   if(num1>num3){
                       System.out.println(num1);
                   }else if(num1==num3){
                       System.out.println(num1);//two
                   }else if(num1<num3){
                       System.out.println(num3);
                   }
               }else if(num2==num3){
                   System.out.println(num2);//two
               }else if(num2<num3){
                   System.out.println(num2);//
               }

           }else if(num3>num1){
                if(num3>num2){
                   if(num1>num2){
                       System.out.println(num1);
                   }else if(num1==num2){
                       System.out.println(num1);
                   }else if(num1<num2){
                       System.out.println(num2);
                   }
                }else if(num3==num2){
                    System.out.println(num3);//two
                }else if(num3<num2){
                    System.out.println(num3);
                }
           }
       }
    }
}
