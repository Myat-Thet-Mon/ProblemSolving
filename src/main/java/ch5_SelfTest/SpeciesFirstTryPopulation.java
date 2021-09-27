package ch5_SelfTest;
//4
import java.util.Scanner;

public class SpeciesFirstTryPopulation {
    public String name;
    public int population;
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
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
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    public int getPopulation() {
        int result = 0;
        double populationAmount = population;
        int count = 10;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = populationAmount +
                    (growthRate / 100) *
                            populationAmount;
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

    public static void main(String[] args) {
        SpeciesFirstTryPopulation p = new SpeciesFirstTryPopulation();
        p.readInput();
        p.writeOutput();
        int countF = 0;
        int countM = 0;
        int population = p.getPopulation();
        for (int i = 1; i <= population; i++) {
            if (i % 2 == 0) {
                countF++;
            } else {
                countM++;
            }
        }
        System.out.println("Total population :" + population);
        System.out.println("Female population :" + countF);
        System.out.println("Male population :" + countM);
    }
}