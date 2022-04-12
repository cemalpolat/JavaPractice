package day09_IfElse_MultuIf;

public class CampusTime {
    public static void main(String[] args) {
        int time = 23;

        if(time >= 8 && time <= 22){
            System.out.println("Open");

        }else if(time < 25 && time > 22 || time < 8){
            System.out.println("Closed");
        }else{
            System.out.println("Invalid Entry");
        }






    }




}
