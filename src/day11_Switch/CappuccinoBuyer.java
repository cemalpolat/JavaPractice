package day11_Switch;

import java.util.Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        String  result;

    //Scanner s = new Scanner(System.in);
      //  System.out.println("Size?");
       // size = s.nextLine();

    if (size== "tall" || size== "grande" || size=="venti"){

        if(size=="tall"){
            result = "price is $3.69\n90 calories";

        }else if(size== "grande"){
            result= "price is $3.99\n120 calories";

        }else{
            result= "price is $4.29\n150 calories";
        }

    }else{
        result= "Invalid Size";
    }

        System.out.println(result);




    }
}
