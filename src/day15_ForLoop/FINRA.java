package day15_ForLoop;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <101 ; i++) {

            if(i % 15==0){
                System.out.print("FINRA ");
            }else if (i % 5 == 0){
                System.out.print("RA ");
            }else if(i % 3 == 0){
                System.out.print("FIN ");

            }else{
                System.out.print(i + " ");
            }
        }


    }

}
