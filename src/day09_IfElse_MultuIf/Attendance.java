package day09_IfElse_MultuIf;

import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        int classAttended;
        int classHeld;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter attendance");
        classAttended = scan.nextInt();
        System.out.println("Enter class held");
        classHeld = scan.nextInt();
        double attendance = ((double)classAttended / classHeld);

        if (attendance>=75d/100){
            System.out.println("Percentage of Class Attended: " +attendance + "\nStudent is allowed to sit in exam");
        }else{
            System.out.println("Percentage of Class Attended: " +attendance + "\nStudent is not allowed to sit in exam");
        }


    }
}
