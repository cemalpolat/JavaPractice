package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65,
                85, 55, 45, 73, 73, 35, 47));
        int countGradeA = 0;
        int countGradeB = 0;
        int countGradeC = 0;
        int countGradeD = 0;
        int countGradeF = 0;

        for (Integer each : scores) {

            if (each >= 90) {
                countGradeA++;
            } else if (each >= 80) {
                countGradeB++;
            } else if (each >= 70) {
                countGradeC++;
            } else if (each >= 60) {
                countGradeD++;
            } else {
                countGradeF++;
            }
        }
        System.out.println("countGradeA = " + countGradeA);
        System.out.println("countGradeB = " + countGradeB);
        System.out.println("countGradeC = " + countGradeC);
        System.out.println("countGradeD = " + countGradeD);
        System.out.println("countGradeF = " + countGradeF);
    }
}