package day36_Inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone Ip1 = new Iphone();
        Ip1.setInfo("IPhone", "7Plus","Black",10000);

        Samsung S1 = new Samsung();
        S1.setInfo("Samsung", "S6","White",11000);

        Nokia N1 = new Nokia();
        N1.setInfo("Nokia","Sel", "Purple",8000);

        System.out.println(Ip1);

        Ip1.call(90125487);
        Ip1.faceTime(1224568789);

        S1.call(125478964);
        S1.freeze();

        System.out.println(S1);


        N1.text(12456987);
        N1.selfDefence();

        System.out.println(N1);


    }
}
