package day31_CustomClass_Constructors;

public class Address {

    public String street, city, state;
    public int buildingNumber, zipCode;

    public Address(String street, String city, String state, int buildingNumber, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber +" "+  street + "\n" + state + ", " + zipCode;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Ecevit Blv", "Eskisehir", "VA", 25, 26020);

        System.out.println(address1);
    }
}
