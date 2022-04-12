package day36_Inheritance.phoneTask;

public class Phone {
    public String brand, model, color;
    public int price;

    public void setInfo(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
