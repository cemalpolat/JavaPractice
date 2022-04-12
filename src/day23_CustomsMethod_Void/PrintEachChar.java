package day23_CustomsMethod_Void;

public class PrintEachChar {
    public static void main(String[] args) {

        printEachChar("Cemal Polat");

    }



    public static void printEachChar(String a){

     char [] ch = a.toCharArray();

        for (char each : ch) {

            System.out.print(each + " ");

        }




    }
}
