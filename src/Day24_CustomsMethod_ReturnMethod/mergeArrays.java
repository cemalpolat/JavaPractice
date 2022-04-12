package Day24_CustomsMethod_ReturnMethod;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {


       int [] arr1 = {1,2,3,8};
       int []arr2 = {9,4,5,6};

        System.out.println(Arrays.toString(meregArrays(arr1,arr2)));



    }


    public static int [] meregArrays(int [] arr1, int[] arr2){

        int [] newArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            newArray[i] = arr1[i];
        }

        for (int j = 0, k = arr1.length; k < newArray.length; k++, j++) {

            newArray[k] = arr2[j];
        }
        return newArray;
    }
}
/*
int[] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;
 */