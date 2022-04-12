package day20_Arrays;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int [] array = {10,0,5,0,1,0};
        int [] newArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

         if(array[i] != 0){
             newArray[j] = array[i] ;
             j++;
         }

        }
        System.out.println(Arrays.toString(newArray));

    }

}
