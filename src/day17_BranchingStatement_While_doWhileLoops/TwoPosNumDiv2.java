package day17_BranchingStatement_While_doWhileLoops;

import java.util.Scanner;

public class TwoPosNumDiv2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int count =0;

        while (num1 >= num2){
            num1 -= num2;
            count++;
        }
        System.out.println(" num1 / num2 = " + count + " with the remainder of " + num1);
    }
}
