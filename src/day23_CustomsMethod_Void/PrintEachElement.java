package day23_CustomsMethod_Void;

public class PrintEachElement {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,4,3,2,1};

        printEachElement(arr1);
    }


    public static void printEachElement(int [] arr ){


        for (int each : arr) {

            System.out.print (each + " ");

        }




    }






}
