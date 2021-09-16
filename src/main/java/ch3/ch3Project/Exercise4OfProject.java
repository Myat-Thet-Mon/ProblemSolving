package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise4OfProject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String line = input.nextLine();
        boolean test=false;
        if (line.charAt(line.length() - 1) == '?') {
            for (int i = 0; i <line.length(); i++) {
                char c = line.charAt(i);
                if (c/2== 0) {
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
    }
}
