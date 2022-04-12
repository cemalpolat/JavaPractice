package day27_WrapperClasses;

public class Task3 {
    public static void main(String[] args) {

       String str = "Wooden Spoon!";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char c : str.toCharArray()) {

            if(Character.isDigit(c)){
                digits += c;
            }

            if (Character.isLetter(c)){
                letters += c;
            }

            if (!Character.isLetterOrDigit(c)){

                specialChars += c;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
