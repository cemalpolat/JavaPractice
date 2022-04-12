package Day24_CustomsMethod_ReturnMethod;

public class MethodPassesTwoPara {
    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";
       int a =  freqOfword(sentence,word );
        System.out.println(a);
    }


    public static int freqOfword(String sentence, String word) {

        String[] arr = sentence.split(" ");

        int count = 0;
        for (String s : arr) {

            if (s.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}

