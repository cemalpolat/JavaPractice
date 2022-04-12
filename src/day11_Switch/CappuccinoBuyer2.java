package day11_Switch;

public class CappuccinoBuyer2 {
    public static void main(String[] args) {
        String size = "venti";
        String  result;

        result = (size== "tall" || size== "grande" || size=="venti")?(size=="tall")?"price is $3.69\n90 calories":
                (size=="grande")? "price is $3.99\n120 calories" :"price is $4.29\n150 calories": "Invalid size";

                     System.out.println(result);
            }


        }









