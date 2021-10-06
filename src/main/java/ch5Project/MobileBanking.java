package ch5Project;

import java.util.Scanner;

class BankAccount {
    private String accountName;
    private int id;
    private String address;
    private int phNo;
    private double oriAmount = 0;

    public void transferFromOther(double amount) {
        this.oriAmount += amount;
    }

    /**
     * if driver enter amount that exceeded the original amount,this method return -1 that means your amount had no enough money to transfer
     *
     * @param amount
     * @return
     */
    public double sentAmountToOther(double amount) {
        if (amount > this.oriAmount) {
            return -1;
        } else {
            return this.oriAmount - amount;
        }
    }

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account name");
        this.accountName = input.nextLine();
        System.out.println("Enter your address");
        this.address = input.nextLine();
        System.out.println("Enter your ph no");
        this.phNo = input.nextInt();
        this.id++;
    }

    public void outputAccountInfo() {
        System.out.println("Your account is :");
        System.out.println("ID :" + this.id);
        System.out.println("Name :" + this.accountName);
        System.out.println("Address :" + this.address);
        System.out.println("Phone No :" + this.phNo);
        System.out.println("Amount :" + this.oriAmount);
    }
}

public class MobileBanking {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.readInput();
        bankAccount.outputAccountInfo();
        bankAccount.transferFromOther(5000);
        bankAccount.sentAmountToOther(3000);
        bankAccount.outputAccountInfo();

    }

}