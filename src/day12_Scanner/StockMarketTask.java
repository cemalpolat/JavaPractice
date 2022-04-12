package day12_Scanner;

import java.util.Scanner;

public class StockMarketTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares you have already?");
        int shares = scan.nextInt();

        System.out.println("How much their total value in the stock market?");
        double value = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter the name of the company you have the most shares in? ");
        String company = scan.nextLine();

        System.out.println("inputs: " + shares + ", " + value + ", " + company +
                "\nYour total stock market holding is " + value + " which is made up of " + shares +
                " shares. " + company+ " is your company holdings");


    }
}
