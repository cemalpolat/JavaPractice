package practiseany;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        int hour, minute, second;
        String amOrPm;

        Scanner scan = new Scanner(System.in);
        hour   = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();
        amOrPm = scan.next();


        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);




    }




}
