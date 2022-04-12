package day28_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

   /*     int  num1 = numbers.get(numbers.size()-1);
        int num2 = numbers.get(0);

       numbers.set(numbers.size()-1, num2);
       numbers.set(0,num1);

        System.out.println(numbers);

    */

        Collections.swap(numbers, 0 ,  numbers.size()-1);
        System.out.println(numbers);
    }
}
