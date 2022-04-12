package Day24_CustomsMethod_ReturnMethod;

import java.util.Arrays;

public class ReturnMergeofTwoArrays {
    public static void main(String[] args) {

       int [] arr1 = {1,2,3,78,98};
       int [] arr2 = {4,5};

       int [] mergedArray = mergeTwoArrays(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray));

    }

    public static int[] mergeTwoArrays(int[] array1, int[] array2){

        int [] temparr = new int[array1.length + array2.length];
        int j =0;
        for (int i : array1) {

            temparr[j++] = i;

        }
        int k =array1.length;
        for (int i : array2) {

            temparr[k++] = i;

        }

        return temparr;
    }


}
