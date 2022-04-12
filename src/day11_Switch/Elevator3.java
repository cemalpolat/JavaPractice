package day11_Switch;

public class Elevator3 {
    public static void main(String[] args) {
        int floorNum = 3;
        String result = "";

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
