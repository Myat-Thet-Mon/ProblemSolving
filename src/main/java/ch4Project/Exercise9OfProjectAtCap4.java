package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise9OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = null;
        do {
            System.out.println("Enter word");
            String word = input.next();
            char a = word.charAt(0);
            String s = Character.toString(a);
            String b = word.substring(1);
            String c = b + s;
            for (int i = 0; i < c.length(); i++) {
                char f = c.charAt(word.length()-1 - i);
                System.out.print(f);
            }
            System.out.println(" ");
            System.out.println("do you want to continue or quit");
            ans = input.next();
        } while (ans.equalsIgnoreCase("continue"));
    }
}


