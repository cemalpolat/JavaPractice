package day27_WrapperClasses;

import java.util.Arrays;

public class TAsk1 {
    public static void main(String[] args) {
        

        int [] arr = {1,2,3,4,5,6,7,8};

        int [] arr1 = changeElement(arr,0,100);

        System.out.println(Arrays.toString(arr1));

    }


    public static int [] changeElement(int [] array, int index, int element){

        array [index] = element;

        return array;
    }
}
