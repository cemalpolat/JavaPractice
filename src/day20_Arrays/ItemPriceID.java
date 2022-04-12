package day20_Arrays;

public class ItemPriceID {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " - #" + itemIDs[i]);
        }
        for (int i = 0; i < items.length; i++) {

         if (items[i].equals("Gloves")){

             System.out.println("The index number of \"Gloves\"is " + itemIDs[i]);
         }
         if (items[i].equals("iPad")){
             System.out.println(items[i] + " is contained in the items list.");
         }

        }








    }
}
