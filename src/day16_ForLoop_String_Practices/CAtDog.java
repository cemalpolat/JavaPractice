package day16_ForLoop_String_Practices;

public class CAtDog {
    public static void main(String[] args) {
        String sentence = "CATdogDOGcaTcatDOg";
        int numDogs = 0;
        int numCats = 0;

        for (int i = 0; i <= sentence.length() - 3; i += 1) {

            if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                numCats += 1;
            }
            if (sentence.substring(i, i + 3).equalsIgnoreCase("dog")) {
                numDogs += 1;
            }
        }
        boolean isSameNumber = (numCats == numDogs);
        System.out.println(isSameNumber);
    }
}
