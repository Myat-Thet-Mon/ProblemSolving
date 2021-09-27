package ch5_SelfTest;

import java.util.Scanner;

public class Exercise12 {

    public String name;
    public int population;
    public double growthRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        this.name = keyboard.nextLine();
        System.out.println("What is the population of the " +
                "species?");
        this.population = keyboard.nextInt();
        System.out.println("Enter growth rate " +
                "(% increase per year):");
        this.growthRate = keyboard.nextDouble();
    }

    public int predictPopulation(int years) {
        int result = 0;
        double populationAmount = this.population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = (populationAmount +
                    (this.growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

   // public int changePopulation(double area,int numberPerMile) {

   // }

    public double getDensity(double area) {
        double number = this.population / area;
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise12 second = new Exercise12();
        second.readInput();
        System.out.println("Enter area");
        double area = input.nextDouble();
        System.out.println("Enter year");
        int year = input.nextInt();
        System.out.println("Enter the change of population");
        int population = input.nextInt();
        System.out.println(second.predictPopulation(year));
        System.out.println(second.getDensity(area));

     //   second.changePopulation(population);
        System.out.println(second.predictPopulation(year));
        System.out.println(second.getDensity(area));
    }
}