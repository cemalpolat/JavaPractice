package day09_IfElse_MultuIf;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 50;
        String message;

        if(level>=90){
            message = "Your tank is full";
        }else if (level>=80) {
            message = "Still OK";
        }else if(level>=70) {
            message = "Don't go far";
        }else if(level>=60) {
            message = "Start to head back";
        }else if(level>=50) {
            message = "Be careful now you are at % 50";
        }else{
            message = "Danger";
        }
        System.out.println(message);


    }
}
