package day18_NestedLoop;

public class Pyramid2 {
    public static void main(String[] args) {

      // String spc = " ";
       // String star = "*  ";


        for (int i = 1; i < 11; i++) {

          for (int j = 1; j < i; j++) {

              System.out.print("   ");
          }

          for (int k = 1; k < 11 -i ; k++) {

              System.out.print("*  ");

          }


            System.out.println();

            }

        }
    }

