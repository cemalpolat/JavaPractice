package day21ArraysUtilityForEachLoop;

public class numberOfPalindromesInArray {
    public static void main(String[] args) {

  String [] pali =  {"anna", "level", "Java", "mem"};

int count = 0;
        for (String each : pali) {

            String a = "";
            for ( int i = each.length()-1; i >= 0; i--){

               a += each.charAt(i);
            }
            if ( a.equals(each)){

                count++;

            }
        }
        System.out.println(count);

    }
}
