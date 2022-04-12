package day21ArraysUtilityForEachLoop;

public class OddEvenOfArray {
    public static void main(String[] args) {

     int [] arr = {1,2,3,4,5};
     int countEven =0;
     int countOdd = 0;

        for (int i : arr) {

            if (i % 2 == 0){
               countEven++;

            }else{
                countOdd++;
            }

        }

        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}
