
/*

 */
import java.util.Scanner;
public class Exercise4 {
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter orignal amount");
    double orignalAmount=input.nextDouble();
    System.out.println("Enter anual interest");
    double anual=input.nextDouble();
    double interest=anual/12;
    System.out.println("Enter given amount");
    double givenAmount=input.nextDouble();
    double interestAmount=(originalAmount/100)*interest;
    orignalAmount=orignalAmount-(givenAmount-intestAmount);
    System.out.println(interestAmount);
    System.out.println(orignalAmount);
  }
}
