package day20_Arrays;

import java.util.Scanner;

public class ItemsAndPrices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] prices = new int[5];
        String[] items = new String[5];
        double total = 0;
        for (int i = 0; i < items.length; i++) {

            System.out.println("Enter an item and its price:");
            items[i] = scan.next();
            prices[i] = scan.nextInt();
            total += prices[i];
        }
        for (int i = 0; i < items.length; i++) {

            System.out.println(items[i] + ": " + prices[i] + " £");
        }
    }
}