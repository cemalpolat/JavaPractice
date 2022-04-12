package day11_Switch;

import java.util.Scanner;

public class Elevator4Scan {
    public static void main(String[] args) {
        int floorNum = 3;
        String result = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Floor");
        floorNum = scan.nextInt();

        switch (floorNum) {
            case (1):
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case (2):
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case (3):
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result = "Invalid Floor";
                break;
        }

        System.out.println(result);






    }





}
