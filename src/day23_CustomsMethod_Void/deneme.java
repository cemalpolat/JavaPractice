package day23_CustomsMethod_Void;

public class deneme {
    public static void main(String[] args) {

     int [] arr = {1,2,3,4,5} ;

     eachElement(arr);



    }

    public static void eachElement(int[] numbers) {

        for (int number : numbers) {
            System.out.println(number);
        }

    }



}
