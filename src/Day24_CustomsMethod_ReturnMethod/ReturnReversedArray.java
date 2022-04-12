package Day24_CustomsMethod_ReturnMethod;

import java.util.Arrays;

public class ReturnReversedArray {
    public static void main(String[] args) {

        int[] arr ={1,2,8,4,5};

      reversedArray(arr);

        System.out.println(Arrays.toString(reversedArray(arr)));

    }


    public static int[] reversedArray(int [] array){
        int[] reversedArray = new int[array.length];


            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

                reversedArray[i] = array[j];

            }



           return reversedArray;
    }
}
