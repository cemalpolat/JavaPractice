package day28_ArrayList;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);


        for (Integer each : numbers) {
            int count = 0;
            for (Integer number : numbers) {

                if (each == number){
                    count++;

                    }
                }
            if (count > 1){
                System.out.println(each);
                break;
            }
        }
    }
}
