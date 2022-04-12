package day23_CustomsMethod_Void;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

      eligibleToAlc(17);

    }


    public static void eligibleToAlc(int age){

     if (age >=18){

         System.out.println("Eligible to buy alcohol");
     }else{
         System.out.println("Not eligible to buy alcohol");

     }
    }
}
