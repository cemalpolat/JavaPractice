package day11_Switch;

public class CappuccinoBuyer3 {
    public static void main(String[] args) {
        String size = "tall";
        String  result;

        if (size== "tall" || size== "grande" || size=="venti"){

            result= (size=="tall")? "price is $3.69\n90 calories":
            (size== "grande")? "price is $3.99\n120 calories":
             "price is $4.29\n150 calories";


        }else{
            result= "Invalid Size";
        }

        System.out.println(result);




    }




}
