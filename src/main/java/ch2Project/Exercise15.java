package ch2Project;

import java.util.Scanner;

/*

 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter month");
        String month=input.next();
        System.out.println("enter day");
        String day=input.next();
        System.out.println("enter year");
        String year=input.next();
        String date=month+"/"+day+"/"+year;
        String format=date.replace("/",".");
        System.out.println(format);
    }
}
