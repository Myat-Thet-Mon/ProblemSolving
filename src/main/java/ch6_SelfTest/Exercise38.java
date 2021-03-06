package ch6_SelfTest;

import java.util.Scanner;

class Money1{
    private long dollars;
    private long cents;

    public void set(long newDollars)
    {
        if (newDollars < 0)
        {
            System.out.println(
                    "Error: Negative amounts of money are not allowed.");
            System.exit(0);
        }
        else
        {
            this.dollars = newDollars;
            this.cents = 0;
        }
    }
    public void set(double newAmount)
    {
        if (newAmount < 0)
        {
            System.out.println(
                    "Error: Negative amounts of money are not allowed.");
            System.exit(0);
        }
        else
        {
            long allCents = Math.round(newAmount * 100);
            this.dollars = allCents / 100;
            this.cents = allCents % 100;
        }
    }
    public void set(Money1 moneyObject)
    {
        this.dollars = moneyObject.dollars;
        this.cents = moneyObject.cents;
    }
    /**
     Precondition: The argument is an ordinary representation
     of an amount of money, with or without a dollar sign.
     Fractions of a cent are not allowed.
     */
    public void set(String amountString)
    {
        String dollarsString;
        String centsString;
//Delete '$' if any:
        if (amountString.charAt(0) == '$')
            amountString = amountString.substring(1);
        amountString = amountString.trim();
//Locate decimal point:
        int pointLocation = amountString.indexOf(".");
        if (pointLocation < 0) //If no decimal point
        {
            this.cents = 0;
            this.dollars = Long.parseLong(amountString);
        }
        else //String has a decimal point.
        {
            dollarsString =
                    amountString.substring(0, pointLocation);
            centsString =
                    amountString.substring(pointLocation + 1);
//one digit in cents means tenths of a dollar
            if (centsString.length() <= 1)
                centsString = centsString + "0";
// convert to numeric
            this.dollars = Long.parseLong(dollarsString);
            this.cents = Long.parseLong(centsString);
            if ((this.dollars < 0) || (this.cents < 0) || (this.cents > 99))
            {
                System.out.println(
                        "Error: Illegal representation of money.");
                System.exit(0);
            }
        }
    }

    public void readInput() {
        System.out.println("Enter amount on a line by itself:");
        Scanner keyboard = new Scanner(System.in);
        String amount = keyboard.nextLine();
        set(amount.trim());
    }

    /**
     Does not go to the next line after displaying money.
     */
    public void writeOutput()
    {
        System.out.print("$" + dollars);
        if (cents < 10)
            System.out.print(".0" + cents);
        else
            System.out.print("." + cents);
    }
    /**
     Returns n times the calling object.
     */
    public Money1 times(int n)
    {
        Money1 product = new Money1();
        product.cents = n * cents;
        long carryDollars = product.cents / 100;
        product.cents = product.cents % 100;
        product.dollars = n * dollars + carryDollars;
        return product;
    }
    /**
     Returns the sum of the calling object and the argument.
     */
    public Money1 add(Money1 otherAmount)
    {
        Money1 sum = new Money1();
        sum.cents = this.cents + otherAmount.cents;
        long carryDollars = sum.cents / 100;
        sum.cents = sum.cents % 100;
        sum.dollars = this.dollars
                + otherAmount.dollars + carryDollars;
        return sum;
    }
}

public class Exercise38 {
    public static void main(String[] args)
    {
        Money1 start = new Money1();
        Money1 goal = new Money1();
        System.out.println("Enter your current savings:");
        start.readInput();
        goal = start.times(2);
        System.out.print(
                "If you double that, you will have ");
        goal.writeOutput();
        System.out.println(", or better yet:");
        goal = start.add(goal);
        System.out.println(
                "If you triple that original amount, you will have:");
        goal.writeOutput();
        System.out.println();
        System.out.println("Remember: A penny saved");
        System.out.println("is a penny earned.");
    }
}
