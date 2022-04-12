package Day24_CustomsMethod_ReturnMethod;

public class reverse {
    public static void main(String[] args) {

        String a = "abaci";

        String b = reverse(a);

        System.out.println(b);


    }


    public static String reverse(String word){

       String reverse = "";
        for (int i = word.length()-1; i >=0; i--){

            reverse += word.charAt(i);


        }

        return reverse;





    }




}
