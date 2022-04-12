package Day24_CustomsMethod_ReturnMethod;

import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {

       int [] arr ={1,2,3};
        int num = 9;

        System.out.println(Arrays.toString(addElement(arr, num)));

    }


    public static int [] addElement(int[] arr, int number){

        int [] newArray = new int[arr.length+1];

        newArray[arr.length] = number;

        for (int i = 0; i < arr.length; i++) {

            newArray[i] = arr[i];
        }

        return newArray;
    }
}
