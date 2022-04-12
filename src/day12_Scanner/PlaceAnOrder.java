package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String product = scan.nextLine();

        System.out.println("Enter the price: ");
        double price = scan.nextDouble();

        System.out.println("Enter quantity: ");
        int  quantity = scan.nextInt();

        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        double totalPrice = quantity * price;

        System.out.println(firstName + ", your order for " + quantity + " " + product+ "s has been places. Your total is " + totalPrice);


    }
}
