package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {

        int inputSeconds = 45000;
        int hours, minutes, seconds;

        seconds = inputSeconds%60;
        minutes = (inputSeconds/60)%60;
        hours = inputSeconds/3600;

       String clock = "Hours: "+hours+" Minutes: "+minutes+" Seconds: "
+seconds;

        System.out.println("clock= "+clock);




    }


}
