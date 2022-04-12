package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        while (true) {

            System.out.println("Which bedroom do you want to reserve, and how many nights are you staying?");
            String room = scan.nextLine();


            while (!(room.equalsIgnoreCase("King Bed") || room.equalsIgnoreCase("Queen Bed") || room.equalsIgnoreCase("Single Bed") )){

                System.out.println("Invalid entry, please re enter:");
                 room = scan.nextLine();

            }

            int nights = scan.nextInt();
            scan.nextLine();
            if (room.equalsIgnoreCase("King Bed")) {
                totalPrice += nights * 120;
            } else if (room.equalsIgnoreCase("Queen Bed")) {
                totalPrice += nights * 100;
            } else if (room.equalsIgnoreCase("Single Bed")) {
                totalPrice += nights * 80;
            }

            System.out.println("would you like to reserve another room?");
            String answer = scan.nextLine();

            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
                System.out.println("Invalid entry, please re enter:");
                answer = scan.nextLine();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Total Price: " + totalPrice);
                System.exit(0);
            }


        }
    }
}