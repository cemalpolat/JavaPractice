package day28_ArrayList;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        int num = numbers.size();
        numbers.set(num-1, 0 );

        System.out.println(numbers);


    }
}
