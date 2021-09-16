package ch4Project;

import java.util.Scanner;

/*

 */
public class Exercise7OfProjectAtCap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = 0;
        double totalScore = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double f = 0;
        double highest = 0;
        double lowest = 0;
        while (score >= 0) {
            System.out.println("Enter score");
            score = input.nextInt();
            totalScore += score;
            if(score<=100 && score>=0) {
                if (score >= 90 && score <= 100) {
                    a++;
                } else if (score >= 80 && score <= 89) {
                    b++;
                } else if (score >= 70 && score <= 79) {
                    c++;
                } else if (score >= 60 && score <= 69) {
                    d++;
                } else if (score >= 0 && score <= 59) {
                    c++;
                }
                if (score > highest) {
                    highest = score;
                } else {
                    highest = highest;
                }
                if (score < lowest) {
                    lowest = score;
                } else {
                    lowest = score;
                }
            }
        }
        System.out.println("Total score " + totalScore);
        double totalGrade = a + b + c + d + f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        System.out.println("Total Grade " + totalGrade);

        System.out.println("Percent if A " + 100 * (a / totalGrade));
        System.out.println("Percent if B " + 100 * (b / totalGrade));
        System.out.println("Percent if C " + 100 * (c / totalGrade));
        System.out.println("Percent if D " + 100 * (d / totalGrade));
        System.out.println("Percent if F " + 100 * (f / totalGrade));
        System.out.println("Height " + highest);
        System.out.println("Lowest "+lowest);
        double average = totalScore / totalGrade;
        System.out.println("Average " + average);
    }
}
