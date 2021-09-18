package ch4Project;

import java.util.Scanner;

/*
Repeat Programming Project 4 of Chapter 3, but use a loop that reads and
processes sentences until the user says to end the program.
 */
public class Exercise1OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean test=false;
        String ans=null;
       /* System.out.println("Enter a string");
        String line = input.nextLine();
        boolean test=false;
        if (line.charAt(line.length() - 1) == '?') {
            for (int i = 0; i <line.length(); i++) {
                char c = line.charAt(i);
                if (c/2== 0) {
                  test=true;
                }
            }
            if(test==true){
               System.out.println("Yes");
           }else {
               System.out.println("No");
           }
        }else if(line.charAt(line.length() - 1) == '!'){
            System.out.println("Wow");

        }*/
        do {
            System.out.println("Enter string ");
            String line=input.nextLine();
            if (line.charAt(line.length() - 1) == '?') {
                for (int i = 0; i <line.length(); i++) {
                    char c = line.charAt(i);
                    int a = Integer.parseInt(String.valueOf(c));
                    if (a/2== 0) {
                        test=true;
                        break;
                    } else {
                        test=false;
                    }
                }
                if(test==true){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else if(line.charAt(line.length() - 1) == '!'){
                System.out.println("Wow");

            }
            System.out.println("Do you want to continue?");
            ans=input.next();
        }while(ans.equalsIgnoreCase("yes"));
    }
}
