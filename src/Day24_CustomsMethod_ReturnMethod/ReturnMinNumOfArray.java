package Day24_CustomsMethod_ReturnMethod;

public class ReturnMinNumOfArray {
    public static void main(String[] args) {

        int [] array = {5,4,1,3,2};

       int a =     minNumOfarray(array);

        System.out.println(a);
    }


    public static int minNumOfarray(int[] arr) {

        int min = arr[0];

        for (int i : arr) {

            if (i < min) {
                min = i;
            }

        }

           return min;

    }


}


