package day28_ArrayList;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C", "D"};
        String [] arr2 = {"E", "F", "G", "H"};

        ArrayList<String> list = new ArrayList<>();

        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }
        System.out.println(list);
    }
}
