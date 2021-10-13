package ch6Project;

import java.util.Scanner;

class Characteristic {
    private String description;
    private int rating;
    private double compatibilityMeasure;

    public Characteristic(String givenString) {
        this.description = givenString;
        this.rating = 0;
    }

    private boolean isValid(int aRating) {
        if (aRating <= 10 && aRating > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * if user input rating is greater than 10 or less than 0;this method do nothing so rating is still original value;
     *
     * @param aRating
     */
    public void setRating(int aRating) {
        if (isValid(aRating) == true) {
            this.rating = aRating;
        }
    }

    /**
     * if user input rating is greater than 10 or less than 0;this method do nothing so rating is still original value;
     */
    public void setRating() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your rating 1 to 10");
        int inputRating = input.nextInt();
        if (isValid(inputRating) == true) {
            this.rating = inputRating;
        }
    }

    public int getRating() {
        return rating;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     * if this method return 0 that means description is no equal
     * @param otherRating
     * @return
     */
    public double getCompatibility(Characteristic otherRating) {
        if (this.isMatch(otherRating) == true) {
            return this.getCompatibilityMeasure(otherRating);
        } else {
            return 0;
        }
    }

    private double getCompatibilityMeasure(Characteristic otherRating) {
        this.compatibilityMeasure = 1 - (((this.rating - otherRating.rating) * (this.rating - otherRating.rating))
                / 81);
        return this.compatibilityMeasure;
    }

    private boolean isMatch(Characteristic otherRating) {
        if (this.description.equals(otherRating.description)) {
            return true;
        } else {
            return false;
        }
    }

}

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your description");
        String description = input.nextLine();
        Characteristic characteristic = new Characteristic(description);
        System.out.println("Enter your rating between 1 to 10");
        int rating = input.nextInt();
        characteristic.setRating(rating);
        System.out.println("Your description " + characteristic.getDescription());
        System.out.println("Your rating is " + characteristic.getRating());
        Characteristic characteristic1 = new Characteristic("Good");
        characteristic1.setRating();
        System.out.println("Compatibility " + characteristic.getCompatibility(characteristic1));

    }
}
