package day33_CustomClass_Statics;

public class Iphone {

    public String model, color, size;
    public int price;

    public static String brand, OS, madeIn;

    public Iphone(String model, String color, String size, int price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is facetiming with the number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is facetiming with the email address " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling to number " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting to number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
