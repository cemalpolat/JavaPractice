package day07_Practice;
// ya da import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
       int year = 2020;
       int yearRemain = year % 4;

        boolean sonuc = yearRemain == 0;

        System.out.println(year + " is leap year: " + sonuc);

/* ya da
                Scanner input = new Scanner(System.in);

                System.out.println("Enter a leap year");

                int year = input.nextInt();

                boolean isLeapYear = year % 4 == 0;
                System.out.println(year + " is leap year: " + isLeapYear);
*/








    }





}
