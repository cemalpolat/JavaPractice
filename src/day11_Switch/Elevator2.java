package day11_Switch;

public class Elevator2 {
    public static void main(String[] args) {
        int floorNum = 4;
        String result = "";

        if (floorNum == 1 || floorNum == 2 | floorNum == 3) {

            switch (floorNum) {
                case (1):
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case (2):
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                    break;
            }

            }else{
                result = "Invalid Floor";
            }

            System.out.println(result);


        }

    }

