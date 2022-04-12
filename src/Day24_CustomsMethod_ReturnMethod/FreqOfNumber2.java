package Day24_CustomsMethod_ReturnMethod;

public class FreqOfNumber2 {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,2,2};

        //  freqOfNumber(array,1);

        System.out.println(freqOfNumber(array,2));

    }

    public static int freqOfNumber(int [] arr, int number){

        int count =0;
        for (int i : arr) {
            if (i == number){
                count++;
        }

        }
        return count;
    }
}

