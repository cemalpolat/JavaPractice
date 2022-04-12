package day35_Encapsulation.item;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank() || !Character.isLetter(name.charAt(0))) {
            return;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != ' ') {
                return;
            }
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (name.equalsIgnoreCase("toilet paper")) {
            quantity = 1;
        }
        this.quantity = quantity;
    }

    public double calcCost() {

        double cost = quantity * unitPrice;
        return cost;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost = $" + calcCost() +
                '}';

    }
}
