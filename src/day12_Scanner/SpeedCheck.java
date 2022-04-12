package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;

        System.out.println("Enter current speed");
        int speed = scan.nextInt();

        if (speed > 55) {
            int difference = speed - 55;
            System.out.println("You're driving " + difference + " mph over the limit. Slow down!");


        } else {
            System.out.println("Thanks for obeying the traffic rules");
        }
        scan.close();
    }
}
