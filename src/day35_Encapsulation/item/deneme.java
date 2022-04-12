package day35_Encapsulation.item;

public class deneme {
    public static void main(String[] args) {



        String name = "a1 $nut lp";

        if (name.isEmpty() || name.isBlank() || !Character.isLetter(name.charAt(0))) {
            System.out.println("return");;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != ' ') {
                System.out.println("ret2");;
            }
        }
    }
}
