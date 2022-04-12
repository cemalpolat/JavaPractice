package Day24_CustomsMethod_ReturnMethod;

public class FreqOfNumberInArray {
    public static void main(String[] args) {

        int[] array ={1,1,1,1,2,2};

      //  freqOfNumber(array,1);

        System.out.println(freqOfNumber(array,1));

    }

    public static int freqOfNumber(int [] arr, int number){

        int count =0;
        for (int i = 0; i < arr.length; i++) {

           if ( arr[i] == number){

               count++;
            }
        }
        return count;

    }

}


