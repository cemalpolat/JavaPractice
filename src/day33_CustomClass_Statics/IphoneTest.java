package day33_CustomClass_Statics;

public class IphoneTest {
    public static void main(String[] args) {

     Iphone iphone1 = new Iphone("7Plus","White","Large",10000);
     Iphone iphone2 = new Iphone("6S","Black","Medium", 7500);

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTime("cemalpolat@gmail.com");




    }
}
