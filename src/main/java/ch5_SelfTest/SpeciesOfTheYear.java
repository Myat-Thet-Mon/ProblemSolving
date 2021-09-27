package ch5_SelfTest;

import java.util.Scanner;

//Exercise 1
public class SpeciesOfTheYear {
    private String name;
    private int population;
    private double growlRate;

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = input.nextLine();
        System.out.println("Enter population");
        this.population = input.nextInt();
        System.out.println("Enter growRate");
        this.growlRate = input.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Name :" + this.name);
        System.out.println("Population :" + this.population);
        System.out.println("GrowRate :" + this.growlRate);
    }

    public static void main(String[] args) {
        SpeciesOfTheYear species = new SpeciesOfTheYear();
        species.readInput();
        species.writeOutput();
    }
}
