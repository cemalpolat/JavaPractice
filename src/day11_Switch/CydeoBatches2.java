package day11_Switch;

public class CydeoBatches2 {
    public static void main(String[] args) {

        String batch = "US evening", result;

    switch(batch){
        case("US Morning" ):
            result = "Class times are 10-5 EST. M, T, Th, F.";
            break;

        case("US Evening"):
            result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            break;

        case("EU"):
            result = "Class times are  10-5 EST. M, T, W, Th, F.";
            break;

        default:
            result = "Invalid Batch";

    }

         System.out.println(result);






    }
}
