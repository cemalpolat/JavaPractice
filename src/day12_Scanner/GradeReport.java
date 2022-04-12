package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int grade = scan.nextInt();

      String result = (grade>=0 && grade<=100)? (grade>=90)? "Grade = A" : (grade>=80)? "Grade = B" : (grade>=70)? "Grade = C":

              (grade>=60)? "Grade = D" : "Grade F" : "Invalid score";

        System.out.println(result);


    }
}
