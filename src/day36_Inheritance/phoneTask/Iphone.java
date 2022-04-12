package day36_Inheritance.phoneTask;

public class Iphone extends Phone{

    public void faceTime (long phoneNumber){
        System.out.println(brand + model + " is facetiming with " + phoneNumber);
    }

    public void faceTimeText (long phoneNumber){
        System.out.println(brand + model + " is facetime texting with " + phoneNumber);
    }

}
