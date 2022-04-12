package DENEME;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class dene {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

       list.addAll(Arrays.asList(1,2,3,4,5,6));

        Collections.reverse(list);
        Collections.sort(list);

        System.out.println(list);

        System.out.println(Collections.min(list));

        System.out.println("========================================");

        int [] arr = {1,2,3,4,5};

        String str = Arrays.toString(arr);

        System.out.println(str);


    }
}
