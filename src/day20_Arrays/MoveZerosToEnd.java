package day20_Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int [] array = {10,0,5,0,1,0};
        int [] newArray = new int[array.length];

        String notZero = "";
        String zero = "";

        for (int i = 0; i < array.length; i++) {

          if(array[i]== 0) {
              zero += array[i];
          }else{
              notZero += array[i];  // bu stringlere int degerleri ekleyip oradan sonra alayim dedim ama
                                    // mesela 10 stringe iki ayri index olarak girer
          }
        }
           String last = notZero + zero;

        for (int i = 0; i < array.length; i++) {
          //  int  a = last.charAt(i); //   buraya kadar geldim ama burada kaldim string charlarini arraya atamadim
           newArray[i] = last.charAt(i) -48;    //

        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(notZero);
    }
}
