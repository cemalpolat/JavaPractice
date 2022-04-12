package day10_NestedIf_Ternary;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number = 75;
        int crew;
        int passengers;

    if(number==50 || number==75 || number==100){

        if(number==50){
          crew = 20; passengers=30;
        }else if (number==75){
        crew = 25; passengers=50;
        }else{
        crew = 30; passengers=70;
        }
        System.out.println(crew + " crew, " + passengers + " passengers");

    }else{
        System.out.println("Invalid number");
    }






    }
}
