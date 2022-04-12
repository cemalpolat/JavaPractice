package day11_Switch;

public class CydeoBatches {
    public static void main(String[] args) {

    String batch = "EU", result;

    if (batch=="US Morning" || batch=="US Evening" || batch=="EU"){
        if (batch=="US Morning"){
            result = "Class times are 10-5 EST. M, T, Th, F.";

        }else if (batch=="US Evening"){
            result = "Class times are 7-10 EST. M, T, W, Th, S, S";

        }else{
            result = "Class times are  10-5 EST. M, T, W, Th, F.";
        }

    }else{
        result = "Invalid Batch";
    }

        System.out.println(result);





    }
}
