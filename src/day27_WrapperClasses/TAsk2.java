package day27_WrapperClasses;

import java.util.Arrays;

public class TAsk2 {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};

       arr= swapElements(arr, 2,4);

        System.out.println(Arrays.toString(arr));
    }

    public static int [] swapElements (int [] array, int indexI, int indexJ){

        int num =  array[indexI];

        array[indexI] = array[indexJ];
        array[indexJ] = num;

        return array;
    }
}
