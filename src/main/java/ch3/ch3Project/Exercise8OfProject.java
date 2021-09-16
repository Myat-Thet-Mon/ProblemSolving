package ch3.ch3Project;

import java.util.Scanner;

/*

 */
public class Exercise8OfProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
        if(word.equals("cat") || word.equals("Cat")){
            System.out.println("Profane");
        }else if(word.equals("dog") || word.equals("Dog")) {
            System.out.println("Profane");
        }else if(word.equals("llama") || word.equals("llama")) {
            System.out.println("Profane");
        }else{
            System.out.println("It is not profane");
        }
    }
}
