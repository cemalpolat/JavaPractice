package day12_Scanner;

import java.util.Scanner;

public class convertCents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        System.out.println(cents + " cents equal to: " + (cents/100) + " dollars and " + (cents%100)+ " cents");


    }
}
