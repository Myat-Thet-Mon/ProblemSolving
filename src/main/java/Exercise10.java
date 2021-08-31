
/*
cent 
 */
import java.util.Scanner;
public class Exercise10 {
 public static void main(String[]args){
   Scanner input=new Scanner(System.in);
   System.out.println("Enter cent");
   int cent=input.nextInt();
   int newOne=cent;
   int quater=newOne/25;
   newOne=newOne%25;
   int dime=newOne/10;
   newOne=newOne%10;
   int nickle=newOne/5;
   
 }
}
