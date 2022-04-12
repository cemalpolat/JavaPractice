package day11_Switch;

import java.util.Scanner;

public class CydeoBatches4Scan {
    public static void main(String[] args) {
        String batch = "", result;

    Scanner s = new Scanner(System.in);
        System.out.println("Enter Batch");
        batch = s.next();

        if (batch=="US Morning" || batch=="US Evening" || batch=="EU"){

            switch(batch) {
                case ("US Morning"):
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case ("US Evening"):
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;

                default :
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
            }

        }else{
            result = "Invalid Batch";
        }

        System.out.println(result);







    }
}
