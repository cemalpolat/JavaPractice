package day22_MultiDimensioanlArrays;

import java.util.Arrays;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

     //   String [][] batch25Groups = new String[3][];

      /*   batch25Groups [0] = batch25Group1;
         batch25Groups [1] = batch25Group2;
         batch25Groups [2] = batch25Group3;

       */
        String [][] batch25Groups = { {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"},{"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"},{"Fady", "Break", "Clock", "Cihad", "Muhtar"}};


        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch24Groups = {{"Fuat", "Kenann", "Aliya", "Anna", "Murodil"}, {"Layla", "Oksana", "Tyler", "Murodil"}, {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"} };


      //  for (int i = 0; i < batch24Groups.length; i++) {


         //   batch25Groups[i] = batch24Groups[i];


      //  }

      //  System.out.println(Arrays.deepToString(batch25Groups));




        String [][][] CydeoStudents = {batch24Groups, batch25Groups};

        for (String[][] batch : CydeoStudents) {

            for (String[] group : batch) {

                for (String student : group) {

                    System.out.print(student + "\t");

                }
                System.out.println();
            }

        }

            }

        }



