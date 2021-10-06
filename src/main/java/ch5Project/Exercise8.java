package ch5Project;

import java.io.IOException;
import java.util.Scanner;

class HangManGame {
    private String secretWord = "banana";
    private String disguisedWord = "??????";
    private int numberOfGuess;
    private int numberOfIncorrectGuess;

    public void makeGuess(char c){
        for (int i=0;i<secretWord.length();i++) {
            if (c == this.secretWord.charAt(i)) {
                this.disguisedWord.replace('?', c);
            }else{
                this.numberOfIncorrectGuess++;
            }
            this.numberOfGuess++;
        }
    }
    public String getDisguisedWord() {
        return this.disguisedWord;
    }

    public String getSecretWord() {
        return this.secretWord;
    }

    public int getGuessCount() {
        return this.numberOfGuess;
    }

    public int getNumberOfIncorrectGuess() {
        return this.numberOfIncorrectGuess;
    }

    public boolean isFound() {
        return secretWord.equalsIgnoreCase(this.disguisedWord);
    }

}
public class Exercise8 {
    public static void main(String[] args) throws IOException {
        HangManGame hangManGame=new HangManGame();
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Enter your character");
            char c = (char) System.in.read();
            hangManGame.makeGuess(c);
            System.out.println("Your disguised word :"+hangManGame.getDisguisedWord());
            System.out.println("Your secret word is :"+hangManGame.getSecretWord());
            System.out.println("The number of guess is :"+hangManGame.getGuessCount());
            System.out.println("The number of incorrect guess is :"+hangManGame.getNumberOfIncorrectGuess());
            if (hangManGame.isFound()==true){
                break;
            }
        }

    }
}