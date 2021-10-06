package ch5Project;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

class ConcertPromoter {
    private String nameOfTheBand = "EXO";
    private int capacityOfTheVenue = 1000;
    private int numberOfTicketSoldByPhone;
    private int numberOfTicketSoldByVenue;
    private double priceOfTicketSoldByPhone = 10000;
    private double priceOfTheTicketSoldByVenue = 15000;
    private double totalSalesAmount;

    public void recordSale(double numberOfTicket, String type) {
        if (type.equalsIgnoreCase("phone")) {
            this.numberOfTicketSoldByPhone += numberOfTicket;

        } else if (type.equalsIgnoreCase("venue")) {
            this.numberOfTicketSoldByVenue += numberOfTicket;
        }
        this.totalSalesAmount = (this.priceOfTheTicketSoldByVenue * this.numberOfTicketSoldByVenue) +
                (this.priceOfTicketSoldByPhone * this.numberOfTicketSoldByPhone);
    }

    public void changePhoneSaleToVenueSale() {
        this.numberOfTicketSoldByVenue = this.numberOfTicketSoldByPhone + this.numberOfTicketSoldByVenue;
        this.numberOfTicketSoldByPhone = 0;
        this.totalSalesAmount = (this.priceOfTheTicketSoldByVenue * this.numberOfTicketSoldByVenue) +
                (this.priceOfTicketSoldByPhone * this.numberOfTicketSoldByPhone);
    }

    public int getNumberOfTicketSold() {
        return (this.numberOfTicketSoldByVenue + this.numberOfTicketSoldByPhone);
    }

    public int getNumberOfTicketRemaining() {
        return (this.capacityOfTheVenue - getNumberOfTicketSold());
    }


    public double getTotalSale() {
        return this.totalSalesAmount;
    }

    public String getNameOfTheBand() {
        return nameOfTheBand;
    }

    public void setNameOfTheBand(String nameOfTheBand) {
        this.nameOfTheBand = nameOfTheBand;
    }

    public int getCapacityOfTheVenue() {
        return capacityOfTheVenue;
    }

    public void setCapacityOfTheVenue(int capacityOfTheVenue) {
        this.capacityOfTheVenue = capacityOfTheVenue;
    }

    public int getNumberOfTicketSoldByPhone() {
        return numberOfTicketSoldByPhone;
    }

    public void setNumberOfTicketSoldByPhone(int numberOfTicketSoldByPhone) {
        this.numberOfTicketSoldByPhone = numberOfTicketSoldByPhone;
    }

    public int getNumberOfTicketSoldByVenue() {
        return numberOfTicketSoldByVenue;
    }

    public void setNumberOfTicketSoldByVenue(int numberOfTicketSoldByVenue) {
        this.numberOfTicketSoldByVenue = numberOfTicketSoldByVenue;
    }

    public double getPriceOfTicketSoldByPhone() {
        return priceOfTicketSoldByPhone;
    }

    public void setPriceOfTicketSoldByPhone(double priceOfTicketSoldByPhone) {
        this.priceOfTicketSoldByPhone = priceOfTicketSoldByPhone;
    }

    public double getPriceOfTheTicketSoldByVenue() {
        return priceOfTheTicketSoldByVenue;
    }

    public void setPriceOfTheTicketSoldByVenue(double priceOfTheTicketSoldByVenue) {
        this.priceOfTheTicketSoldByVenue = priceOfTheTicketSoldByVenue;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        ConcertPromoter concertPromoter = new ConcertPromoter();
        Scanner input = new Scanner(System.in);
        String ans = null;
        do {
            System.out.println("Enter number of ticket");
            int ticket = input.nextInt();
            if (ticket > concertPromoter.getCapacityOfTheVenue()) {
                System.out.println("sry! Your ticket number is exceed our capacity .Try again!");
                break;
            }
            System.out.println("Enter ticket type phone or venue");
            String type = input.next();
            concertPromoter.recordSale(ticket, type);
            System.out.println(concertPromoter.getNameOfTheBand());
            System.out.println("Capacity of venue :" + concertPromoter.getCapacityOfTheVenue());
            System.out.println("Total sales :" + concertPromoter.getTotalSale());
            concertPromoter.changePhoneSaleToVenueSale();
            System.out.println("Total sales after change :" + concertPromoter.getTotalSale());
            System.out.println("NumberOfTicketSold :" + concertPromoter.getNumberOfTicketSold());
            System.out.println("NumberOfTicketRemaining :" + concertPromoter.getNumberOfTicketRemaining());
            System.out.println("Do you want to buy or not");
            ans = input.next();
        } while (ans.equalsIgnoreCase("buy"));
    }
}
