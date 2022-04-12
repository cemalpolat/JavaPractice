package day33_CustomClass_Statics;

public class Address {

    public String street, city, state;
    public int zipCode, buildingNumber;

    public static String country = "TR";
    public static String planet = "World";

    public Address(String street, String city, String state,
                   int zipCode, int buildingNumber) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " "+ state + ", "+zipCode;
    }
}
