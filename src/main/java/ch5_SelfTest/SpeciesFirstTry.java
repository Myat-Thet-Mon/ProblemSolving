package ch5_SelfTest;

import java.util.Scanner;

public class SpeciesFirstTry {
    private int number;
    private String name;
    private int population;
    private double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of each species");
        number = keyboard.nextInt();
        System.out.println("What is the species' name?");
        name = keyboard.nextLine();
        System.out.println("What is the population of the " +
                "species?");
        population = keyboard.nextInt();
        System.out.println("Enter growth rate " +
                "(% increase per year):");
        growthRate = keyboard.nextDouble();
    }

    public void writeOutput() {
        System.out.println("Number = " + number);
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    public static void main(String[] args) {
        SpeciesFirstTry species = new SpeciesFirstTry();
        species.readInput();
        species.writeOutput();
    }
}
