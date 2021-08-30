
/*

 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string ");
        String one=input.nextLine();
        System.out.println("Enter a second string ");
        String two=input.nextLine();
        String three=one+two;
        System.out.println(three);
    }
}
