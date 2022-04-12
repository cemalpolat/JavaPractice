package Day24_CustomsMethod_ReturnMethod;

public class ReturnMaxNumFromArray {
    public static void main(String[] args) {

int [] array = {1,2,3,4,6,5};

maxNumofArray(array);

    }

    public static void maxNumofArray(int[] arr){

        int max = arr[0];
        for (int i : arr) {

            if (i > max){
                max = i;
            }

        }
        System.out.println(max);
    }



}
