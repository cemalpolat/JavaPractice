package day15_ForLoop;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int result = 0;

        for(int i = 1; i <=5; i ++){

            if ( i % 2 != 0){
                result = result + i;
            }
        }

        System.out.println(result);





    }
}
