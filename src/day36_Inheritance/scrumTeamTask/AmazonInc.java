package day36_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {

        ProductOwner pO1 = new ProductOwner();
        pO1.setInfo("Ali",28, 'M', "EU814", "PO", 125000);

        ScrumMaster sM1 = new ScrumMaster();
        sM1.setInfo("Ayse", 35, 'F', "EU6", "SM", 135000);

        BussinessAnalyst  bA1 = new BussinessAnalyst();
        bA1.setInfo("Ahmet", 40, 'M', "EU601", "BA", 115000);


        Tester tst1 = new Tester();
        tst1.setInfo("Aysen", 41, 'F', "EU678", "SDET", 110000);

        Tester tst2 = new Tester();
        tst2.setInfo("Veli", 41, 'M', "EU701", "SDET", 112000);

        Tester tst3 = new Tester();
        tst3.setInfo("Mehmet", 47, 'M', "EU710", "SDET", 85000);

        Tester tst4 = new Tester();
        tst4.setInfo("Kamil", 41, 'M', "EU796", "SDET", 110000);

        Developer dvlp1 = new Developer();
        dvlp1.setInfo("Cemal", 41, 'M', "EU890", "SE", 111000);

        Developer dvlp2 = new Developer();
        dvlp2.setInfo("Gul", 41, 'F', "EU890", "SE", 150000);

        Developer dvlp3 = new Developer();
        dvlp3.setInfo("Gulsen", 43, 'F', "EU8901", "SE", 145000);

        Developer dvlp4 = new Developer();
        dvlp4.setInfo("Cem", 41, 'M', "EU875", "SE", 155000);

        Developer dvlp5 = new Developer();
        dvlp5.setInfo("Ilker", 50, 'M', "EU8905", "SE", 175000);

        ArrayList<Tester>testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tst1,tst2,tst3,tst4));

        ArrayList<Developer>developers = new ArrayList<>();
        developers.addAll(Arrays.asList(dvlp1,dvlp2,dvlp3,dvlp4,dvlp5));


        ScrumTeam sT1 = new ScrumTeam(pO1,sM1,bA1,testers,developers);

       System.out.println(sT1);

      // Tester tst5 = new Tester();

      // tst5.setInfo("Vedat", 35, 'M', "EU8789","SDET",95000);

      //  sT1.addTester(tst5);

     //   sT1.removeTester("EU678");

       // tst1.eat();

       // System.out.println(testers);
     //   System.out.println(sT1);


      //  System.out.println(sT1.developers);

       // System.out.println(sT1.nameOfDevelopers());



      /*  for (Tester tester : sT1.testers) {
            System.out.println(tester.name + ":"+ tester.salary);
        }

       */



    }
}
