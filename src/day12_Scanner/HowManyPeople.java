package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       System.out.println("How many people you live with?: ");
       int people = scan.nextInt();

      String result = (people>=1)?(people<3)? "Live with less than 3 people" : (people>=3 && people<=6)? "Live with 3 - 6 people" : "Live with more than 6 people": "Invalid";


        System.out.println(result);
       }


    }

