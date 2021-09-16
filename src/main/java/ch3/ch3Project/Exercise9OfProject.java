package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise9OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.next();
        if (word.length() == 10) {
            if (word.charAt(2) == '/' && word.charAt(5) == '/') {
                int a = Character.getNumericValue(word.charAt(0));
                String one = Character.toString(a);
                int b = Character.getNumericValue(word.charAt(1));
                String two = Character.toString(b);
                int c = Character.getNumericValue(word.charAt(3));
                String three = Character.toString(c);
                int d = Character.getNumericValue(word.charAt(4));
                String four = Character.toString(d);
                int e = Character.getNumericValue(word.charAt(6));
                String five = Character.toString(e);
                int f = Character.getNumericValue(word.charAt(7));
                String six = Character.toString(f);
                int g = Character.getNumericValue(word.charAt(8));
                String seven = Character.toString(g);
                int h = Character.getNumericValue(word.charAt(9));
                String eight = Character.toString(h);
                String month = one + two;
                int intMonth = Integer.parseInt(month);
                String day = three + four;
                int intDay = Integer.parseInt(day);
                String year = five + six + seven + eight;
                if (intMonth <= 12 && intDay <= 30) {
                    System.out.println("Valid Date");

                }else{
                    System.out.println(" Invalid ");
                }
            }
        } else {
            System.out.println("Invalid");
        }

    }
}
