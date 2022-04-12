package day11_Switch;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        String result= "";

    if(floorNum==1 || floorNum==2 |  floorNum==3){
        if(floorNum==1){
            result= "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
        }else if(floorNum==2){
            result=  "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
        }else{
            result= "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        }

    }else{
            result= "Invalid Floor";
    }

        System.out.println(result);

    }

}
